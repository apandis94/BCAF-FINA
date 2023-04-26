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

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Sidebar/FINA_CMS_Sidebar_MobileSol_Button'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Sidebar/FINA_CMS_Sidebar_MobileSol_Button'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Sidebar/FINA_CMS_Sidebar_Mobile User Management'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_MobileMgmt/FINA_CMS_MobileMgmt_Filter_Button'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_MobileMgmt/FINA_CMS_MobileMgmt_Filter_Field_dropdown'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_MobileMgmt/FINA_CMS_MobileMgmt_Filter_Field_Type_dropdownval'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_MobileMgmt/FINA_CMS_MobileMgmt_Filter_Criteria_dropdown'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_MobileMgmt/FINA_CMS_MobileMgmt_Filter_Criteria_Exact_dropdownval'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_MobileMgmt/FINA_CMS_MobileMgmt_Filter_Value_dropdown'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_MobileMgmt/FINA_CMS_MobileMgmt_Filter_Value_Customer_dropdownval'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_MobileMgmt/FINA_CMS_MobileMgmt_Filter_Search_button'))

'filter dengan 1 kriteria'
WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_MobileMgmt/FINA_CMS_MobileMgmt_Filter_Add filter_Button'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_MobileMgmt/FINA_CMS_MobileMgmt_Filter_Field2_dropdown'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_MobileMgmt/FINA_CMS_MobileMgmt_Filter_Field_Name_dropdownval'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_MobileMgmt/FINA_CMS_MobileMgmt_Filter_Criteria2_dropdown'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_MobileMgmt/FINA_CMS_MobileMgmt_Filter_Criteria_Exact_dropdownval'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_MobileMgmt/FINA_CMS_MobileMgmt_Filter_Value2_dropdown'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_MobileMgmt/FINA_CMS_MobileMgmt_Filter_Value_name2_textbox'))

WebUI.setText(findTestObject('DMS_FINA_CMS/FINA_CMS_MobileMgmt/FINA_CMS_MobileMgmt_Filter_Value_name2_textbox'), FINA_cust)

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_MobileMgmt/FINA_CMS_MobileMgmt_Filter_Search2_button'))

'filter dengan 2 kriteria, search customer yang tidak terdaftar di CMS\r\n'
WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_MobileMgmt/FINA_CMS_MobileMgmt_Filter_Remove filter_Button'))

'Reset filter pencarian'
WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_MobileMgmt/FINA_CMS_MobileMgmt_Filter_Reset_button'))

WebUI.takeFullPageScreenshot()

