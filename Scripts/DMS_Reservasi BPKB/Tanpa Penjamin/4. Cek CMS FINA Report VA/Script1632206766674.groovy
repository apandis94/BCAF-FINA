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
import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper as MobileElementCommonHelper
import io.appium.java_client.MobileElement as MobileElement

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.FINAURL)

WebUI.delay(3)

WebUI.setText(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Login/FINA_CMS_textbox_username'), GlobalVariable.FINAID)

WebUI.setText(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Login/FINA_CMS_textbox_password'), GlobalVariable.FINAPass)

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Login/FINA_CMS_button_Login'))

WebUI.delay(1)

WebUI.delay(1)

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Sidebar/FINA_CMS_Sidebar_Button'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Report/VA/FINA_CMS_Report_Button'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Report/VA/FINA_CMS_Report_AutodebetVA_Button'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Report/VA/FINA_Report_AutodebetVA_FilterContractNo_Search_Button'))

WebUI.delay(1)

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Report/VA/FINA_Report_AutodebetVA_Filter_ContractNo_Text'))

WebUI.setText(findTestObject('DMS_FINA_CMS/FINA_CMS_Report/VA/FINA_Report_AutodebetVA_Filter_ContractNo_Text'), FINA_nokontrak)

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Report/VA/FINA_Report_AutodebetVA_Filter_Search_Button'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Report/VA/FINA_Report_AutodebetVA_Filter_List1_Button'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Report/VA/FINA_Report_Konfirmasi_Search_Button'))

