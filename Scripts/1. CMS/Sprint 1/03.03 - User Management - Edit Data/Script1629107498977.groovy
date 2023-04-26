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

'Pengulangan'
WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Sidebar/FINA_CMS_Sidebar_UserMgmnt_Button'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Sidebar/FINA_CMS_Sidebar_UserMgmnt_User_Button'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Edit/FINA_CMS_User_Add Filter_Button'))

'Add Filter username'
WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Edit/FINA_CMS_User_Add Filter_Field2_dropdown'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Edit/FINA_CMS_User_Add Filter_Field2_Username_dropdownval'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Edit/FINA_CMS_User_Add Filter_Criteria2_dropdown'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Edit/FINA_CMS_User_Add Filter_Criteria2_Exact_dropdownval'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Edit/FINA_CMS_User_Add Filter_Value2_textbox'))

WebUI.setText(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Edit/FINA_CMS_User_Add Filter_Value2_textbox'), FINA_Username)

'Find username FINA'
WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Edit/FINA_CMS_User_Filter_Search2_Button'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Edit/FINA_CMS_User_Action_Edit_button'))

WebUI.verifyElementPresent(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Edit/FINA_CMS_Userdetail_Username_Textbox'), 0)

WebUI.verifyElementPresent(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Edit/FINA_CMS_Userdetail_Fullname_Textbox'), 0)

WebUI.verifyElementPresent(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Edit/FINA_CMS_Userdetail_Job_Textbox'), 0)

WebUI.verifyElementPresent(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Edit/FINA_CMS_Userdetail_Roles_Textbox'), 0)

WebUI.verifyElementPresent(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Edit/FINA_CMS_Userdetail_BranchID_Listbox'), 0)

WebUI.verifyElementPresent(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Edit/FINA_CMS_Userdetail_Branchname_Listbox'), 0)

'Verifikasi Element detail Username, Fullname, Job, Role, Branch, take screenshoot role \'Before\''
WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Edit/Page_BCA Finance - Application/FINA_CMS_EditUser_Search_Role_Button'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Edit/Page_BCA Finance - Application/FINA_CMS_EditUser_Search_Role_AddFilter_Button'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Edit/Page_BCA Finance - Application/FINA_CMS_EditUser_Search_Role_AddFilter_Criteria_dropdown'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Edit/Page_BCA Finance - Application/FINA_CMS_EditUser_Search_Role_AddFilter_Criteria_Exact_dropdownval'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Edit/Page_BCA Finance - Application/FINA_CMS_EditUser_Search_Role_AddFilter_Value_textbox'))

WebUI.setText(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Edit/Page_BCA Finance - Application/FINA_CMS_EditUser_Search_Role_AddFilter_Value_textbox'), 
    edit_role1)

'Search role dari variable edit_role1\r\n'
WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Edit/Page_BCA Finance - Application/FINA_CMS_EditUser_Search_Role_AddFilter_Search_Button'))

'checklist role di checkbox 1\r\n '
WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Edit/Page_BCA Finance - Application/FINA_CMS_EditUser_Search_Role_List_1st row_checkbox'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Edit/Page_BCA Finance - Application/FINA_CMS_EditUser_Search_Role_AddFilter_Value_textbox'))

WebUI.setText(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Edit/Page_BCA Finance - Application/FINA_CMS_EditUser_Search_Role_AddFilter_Value_textbox'), 
    edit_role2)

'Search role dari variable edit_role2\r\n'
WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Edit/Page_BCA Finance - Application/FINA_CMS_EditUser_Search_Role_AddFilter_Search_Button'))

'checklist role di checkbox 1\r\n '
WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Edit/Page_BCA Finance - Application/FINA_CMS_EditUser_Search_Role_List_1st row_checkbox'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Edit/Page_BCA Finance - Application/FINA_CMS_EditUser_Roles_OK_Button'))

'Take screenshoot role \'After\''
WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Edit/Page_BCA Finance - Application/FINA_CMS_EditUser_Update_Button'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Edit/Page_BCA Finance - Application/FINA_CMS_EditUser_Update_Confirmation_OK_Button'))

WebUI.takeFullPageScreenshot()

