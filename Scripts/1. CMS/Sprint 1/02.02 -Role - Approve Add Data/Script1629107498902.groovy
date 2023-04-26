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

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Sidebar/FINA_CMS_Sidebar_MobileSol_Approval_Button'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Sidebar/FINA_CMS_Sidebar_MobileSol_Approval_Role_Button'))

'Masuk ke menu approval role FINA'
WebUI.takeFullPageScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Approval/Role/Role - Add Filter/141021/Page_BCA Finance - Application/FINA_filter_add_button'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Approval/Role/Role - Add Filter/141021/Page_BCA Finance - Application/FINA_filter_field_dropdown'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Approval/Role/Role - Add Filter/141021/Page_BCA Finance - Application/FINA_filter_field_rolename_dropdownval'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Approval/Role/Role - Add Filter/141021/Page_BCA Finance - Application/FINA_filter_criteria_dropdown'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Approval/Role/Role - Add Filter/141021/Page_BCA Finance - Application/FINA_filter_criteria_exact_dropdownval'))

WebUI.setText(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Approval/Role/Role - Add Filter/141021/Page_BCA Finance - Application/input_Criteria_valuein'), 
    GlobalVariable.FINA_Rolename)

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Approval/Role/Role - Add Filter/141021/Page_BCA Finance - Application/FINA_Filter_Search_Button'))

WebUI.delay(1)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Approval/Role/Role - Add Filter/141021/Page_BCA Finance - Application/FINA_role_detail_list1_button'))

'Verifikasi detail penambahan role\r\n'
WebUI.takeFullPageScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Approval/Role/FINA_CMS_Menu_Approval_Role_Approve_button'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Approval/Role/FINA_CMS_Menu_Approval_Role_Ok_Button'))

'Approval penambahan role'
WebUI.takeFullPageScreenshot()

WebUI.delay(1)

