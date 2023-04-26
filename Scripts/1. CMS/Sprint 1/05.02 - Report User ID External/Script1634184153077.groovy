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

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Sidebar/FINA_CMS_Menu_Home'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Sidebar/FINA_CMS_Sidebar_Button'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Report/external/FINA_Report_UserExternal_Button'))

WebUI.delay(1)

'tampilan report user external'
WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Report/external/FINA_reportusrexternal_type_dropdown'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Report/external/FINA_reportusrexternal_type_dealer_dropdownval'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Report/external/FINA_reportusrexternal_status_dropdown'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Report/external/FINA_reportusrexternal_status_active_dropdownval'))

WebUI.delay(1)

'search berdasarkan kriteria'
WebUI.takeFullPageScreenshot()

'\r\n'
WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Report/external/FINA_reportusrexternal_search_button'))

WebUI.delay(15)

'hasil pencarian user external dengan kriteria'
WebUI.takeFullPageScreenshot()

