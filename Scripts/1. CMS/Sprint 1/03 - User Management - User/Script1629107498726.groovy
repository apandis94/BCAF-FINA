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

'Pengulangan karena perubahan dari default'
WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Sidebar/FINA_CMS_Sidebar_UserMgmnt_Button'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Sidebar/FINA_CMS_Sidebar_UserMgmnt_User_Button'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Fina_CMS_Sidebarmenu_User_Value_dropdown'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Fina_CMS_Sidebarmenu_User_Value_Rejected_Dropdownval'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Fina_CMS_Sidebarmenu_User_Search_button'))

'Pengecekan search pada filter menu user\r\n'
WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Fina_CMS_Sidebarmenu_User_Reset_button'))

'Reset filter menu user\r\n'
WebUI.takeFullPageScreenshot()

'Penambahan filter search user\r\n'
WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Filter User/FINA_CMS_User_Add Filter_Button'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Filter User/FINA_CMS_User_Add Filter_Field2_Dropdown'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Filter User/FINA_CMS_User_Add Filter_Field2_Username_Dropdownval'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Filter User/FINA_CMS_User_Add Filter_Criteria2_Dropdown'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Filter User/FINA_CMS_User_Add Filter_Criteria2_Exact_Dropdownval'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Filter User/FINA_CMS_User_Add Filter_Value2_Textbox'))

WebUI.setText(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Filter User/FINA_CMS_User_Add Filter_Value2_Textbox'), FINA_Username)

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Filter User/FINA_CMS_User_Add Filter_Search_Button'))

WebUI.delay(1)

WebUI.takeFullPageScreenshot()

WebUI.verifyElementPresent(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Fina_CMS_Sidebarmenu_User_Sort_Username_button'), 
    1)

WebUI.verifyElementPresent(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Fina_CMS_Sidebarmenu_User_Sort_Name_button'), 1)

WebUI.verifyElementPresent(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Fina_CMS_Sidebarmenu_User_Sort_Status_button'), 1)

WebUI.verifyElementPresent(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Fina_CMS_Sidebarmenu_User_Sort_UpdatedDate_button'), 
    1)

'Verifikasi field - field pada list user\r\n'
WebUI.takeFullPageScreenshot()

WebUI.delay(1)

