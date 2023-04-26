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

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/Fina_CMS_Sidebarmenu_User_Adduser_button'))

WebUI.setText(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/FINA_CMS_Menu_User_Add/FINA_CMS_User_Add Data_username_textbox'), 
    username)

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/FINA_CMS_Menu_User_Add/FINA_CMS_User_Add Data_Search Id Ldap_button'))

WebUI.delay(1)

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/FINA_CMS_Menu_User_Add/FINA_CMS_User_Add Data_Search Role_button'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/FINA_CMS_Menu_User_Add/FINA_CMS_User_Add Data_Addrole_Admin_checkbox'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/FINA_CMS_Menu_User_Add/FINA_CMS_User_Add Data_Addrole_OK_button'))

'Penambahan user dan role'
WebUI.takeFullPageScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/FINA_CMS_Menu_User_Add/FINA_CMS_User_Add Data_Save_button'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_User/FINA_CMS_Menu_User_Add/FINA_CMS_User_Add Data_Confirm_OK_button'))

