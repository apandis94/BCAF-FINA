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

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_RoleManagement/FINA_CMS_Menu_Role_Add/FINA_CMS_Menu_Role_AddData_Button'))

WebUI.setText(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_RoleManagement/FINA_CMS_Menu_Role_Add/FINA_CMS_Menu_Role_Add_Rolename_textbox'), 
    GlobalVariable.FINA_Rolename)

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_RoleManagement/FINA_CMS_Menu_Role_Add/FINA_CMS_Menu_Role_Add_UserMgmt_Read_Checkbox'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_RoleManagement/FINA_CMS_Menu_Role_Add/FINA_CMS_Menu_Role_Add_MblSolution_Read_Checkbox'))

WebUI.delay(1)

'Penambahan role baru di CMS FINA'
WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_RoleManagement/FINA_CMS_Menu_Role_Add/FINA_CMS_Menu_Role_Add_Save_Button'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_RoleManagement/FINA_CMS_Menu_Role_Add/FINA_CMS_Menu_Role_Add_OK_Button'))

'Konfirmasi penambahan role baru\r\n'
WebUI.takeFullPageScreenshot()

WebUI.delay(5)

'Verifikasi role yang sudah ditambahkan, menunggu approval\r\n'
WebUI.takeFullPageScreenshot()

WebUI.delay(1)

