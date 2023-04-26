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

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Sidebar/FINA_CMS_Sidebar_UserMgmnt_Button'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Sidebar/FINA_CMS_Sidebar_UserMgmnt_Role_Button'))

WebUI.verifyElementPresent(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_RoleManagement/FINA_CMS_Menu_Role_Field_Text'), 1)

WebUI.verifyElementPresent(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_RoleManagement/Fina_CMS_Menu_Role_Criteria_Dropdown'), 
    1)

WebUI.verifyElementPresent(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_RoleManagement/FINA_CMS_Menu_Role_Value_dropdown'), 1)

'Cek Kolom Field, Criteria, dan Value pada filter'
WebUI.takeFullPageScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_RoleManagement/FINA_CMS_Menu_Role_Value_dropdown'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_RoleManagement/Add filter/FINA_Role_Field_Value_Approved_Dropdownval'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_RoleManagement/FINA_CMS_Menu_Role_Search_Button'))

WebUI.takeFullPageScreenshot()

'Add filter baru rolename sesuai variable\r\n\r\n'
WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_RoleManagement/Add filter/FINA_Role_Add Filter_Button'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_RoleManagement/Add filter/FINA_Role_Field2_Dropdown'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_RoleManagement/Add filter/FINA_Role_Field_Rolename_Dropdownval'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_RoleManagement/Add filter/FINA_Role_Criteria2_Dropdown'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_RoleManagement/Add filter/FINA_Role_Criteria_Exact2_Dropdownval'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_RoleManagement/Add filter/FINA_Role_Criteria_Value2_Text'))

WebUI.setText(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_RoleManagement/Add filter/FINA_Role_Criteria_Value2_Text'), FINA_Rolename)

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_RoleManagement/Add filter/FINA_CMS_Menu_Role_Search2_Button'))

'Cek Search role berdasarkan filter'
WebUI.takeFullPageScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_RoleManagement/Add filter/FINA_CMS_Menu_Role_Reset2_Button'))

'Reset filter pada menu role\r\n'
WebUI.takeFullPageScreenshot()

WebUI.delay(1)

