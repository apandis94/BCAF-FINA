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

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Sidebar/FINA_CMS_Sidebar_MobileSol_Approval_Button'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Sidebar/FINA_CMS_Sidebar_MobileSol_Approval_Role_Button'))

'Masuk ke menu approval role FINA'
WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Approval/Role/Role - Add Filter/FINA_CMS_Approval_Role_Add Filter_Button'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Approval/Role/Role - Add Filter/FINA_CMS_Approval_Role_Filter_Field_Dropdown'))

'Add filter Role name\r\n'
WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Approval/Role/Role - Add Filter/FINA_CMS_Approval_Role_Filter_Field_Rolename_Dropdownval'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Approval/Role/Role - Add Filter/FINA_CMS_Approval_Role_Filter_Criteria_Dropdown'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Approval/Role/Role - Add Filter/FINA_CMS_Approval_Role_Filter_Criteria_Exact_Dropdownval'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Approval/Role/Role - Add Filter/FINA_CMS_Approval_Role_Filter_Value_Textbox'))

WebUI.setText(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Approval/Role/Role - Add Filter/FINA_CMS_Approval_Role_Filter_Value_Textbox'), 
    GlobalVariable.FINA_Rolename)

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Approval/Role/Role - Add Filter/FINA_CMS_Approval_Role_Add Filter_Search_Button'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Approval/Role/Role - Add Filter/FINA_CMS_Approve_Role_view 1st_Button'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Approval/Role/FINA_CMS_Menu_Approval_Role_Approve_button'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Approval/Role/FINA_CMS_Menu_Approval_Role_Ok_Button'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

