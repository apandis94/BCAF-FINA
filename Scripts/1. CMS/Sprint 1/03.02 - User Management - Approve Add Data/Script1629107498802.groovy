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

'Pengulangan karena sidebar berubah dari kondisi default'
WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Sidebar/FINA_CMS_Sidebar_MobileSol_Button'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Sidebar/FINA_CMS_Sidebar_MobileSol_Approval_Button'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Sidebar/FINA_CMS_Sidebar_MobileSol_Approval_User_Button'))

WebUI.delay(1)

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Approval/User/Page_BCA Finance - Application/FINA_CMS_Menu_Approval_User_Filter_Button'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Approval/User/Page_BCA Finance - Application/FINA_CMS_Menu_Approval_Field_dropdown'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Approval/User/Page_BCA Finance - Application/Page_BCA Finance - Application/FINA_CMS_Menu_Approval_Field_Username_dropdownvalue'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Approval/User/Page_BCA Finance - Application/FINA_CMS_Menu_Approval_Criteria_dropdown'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Approval/User/Page_BCA Finance - Application/FINA_CMS_Menu_Approval_Criteria_Exact_dropdownvalue'))

WebUI.setText(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Approval/User/Page_BCA Finance - Application/Page_BCA Finance - Application/FINA_CMS_Menu_Approval_Value_Username_text'), 
    GlobalVariable.FINA_username_Add)

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Approval/User/Page_BCA Finance - Application/FINA_CMS_Menu_Approval_Value_Filter_Search_Button'))

'Filter data approval berdasarkan data dengan pengajuan baru'
WebUI.takeFullPageScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Approval/User/FINA_CMS_Menu_Approval_User_view_button'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Approval/User/FINA_CMS_Menu_Approval_User_search role_button'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Approval/User/FINA_CMS_Menu_Approval_User_close role_button'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Approval/User/FINA_CMS_Menu_Approval_User_Approve_button'))

'Konfirmasi approval user'
WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_Menu_Approval/User/FINA_CMS_Menu_Approval_User_Confirmation_OK_button'))

