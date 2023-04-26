import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://devfina.kreditkerenbanget.com/cms-uat/#/login')

WebUI.setText(findTestObject('Object Repository/DMS_FINA_CMS/FINA_CMS_Report/test/Page_BCA Finance - Application/input_Login to start BCA Finance_username'), 
    'emerioint3')

WebUI.setText(findTestObject('Object Repository/DMS_FINA_CMS/FINA_CMS_Report/test/Page_BCA Finance - Application/input_Username_password'), 
    'Abc123+')

WebUI.sendKeys(findTestObject('Object Repository/DMS_FINA_CMS/FINA_CMS_Report/test/Page_BCA Finance - Application/input_Username_password'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/DMS_FINA_CMS/FINA_CMS_Report/test/Page_BCA Finance - Application/i_menu'))

WebUI.click(findTestObject('Object Repository/DMS_FINA_CMS/FINA_CMS_Report/test/Page_BCA Finance - Application/mat-panel-title_settings Report'))

WebUI.click(findTestObject('Object Repository/DMS_FINA_CMS/FINA_CMS_Report/test/Page_BCA Finance - Application/a_User ID Internal'))

WebUI.delay(2)

'tampilan report user internal'
WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/DMS_FINA_CMS/FINA_CMS_Report/test/Page_BCA Finance - Application/button_search'))

WebUI.setText(findTestObject('Object Repository/DMS_FINA_CMS/FINA_CMS_Report/test/Page_BCA Finance - Application/input_Filter Data_valuein'), 
    'MO')

WebUI.click(findTestObject('Object Repository/DMS_FINA_CMS/FINA_CMS_Report/test/Page_BCA Finance - Application/button_search Search'))

WebUI.delay(2)

'search report berdasarkan kriteria\r\n'
WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/DMS_FINA_CMS/FINA_CMS_Report/test/Page_BCA Finance - Application/mat-icon_done'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/DMS_FINA_CMS/FINA_CMS_Report/test/Page_BCA Finance - Application/button_search Search'))

WebUI.delay(5)

'hasil pencarian report user internal'
WebUI.takeFullPageScreenshot()

