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

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_MobileMgmt/FINA_CMS_MobileMgmt_Filter_Field_dropdown'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_MobileMgmt/FINA_CMS_MobileMgmt_Filter_Field_Name_dropdownval'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_MobileMgmt/FINA_CMS_MobileMgmt_Filter_Criteria_dropdown'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_MobileMgmt/FINA_CMS_MobileMgmt_Filter_Criteria_Exact_dropdownval'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_MobileMgmt/FINA_CMS_MobileMgmt_Filter_Value_name_textbox'))

WebUI.setText(findTestObject('DMS_FINA_CMS/FINA_CMS_MobileMgmt/FINA_CMS_MobileMgmt_Filter_Value_name_textbox'), FINA_cust)

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_MobileMgmt/FINA_CMS_MobileMgmt_Filter_Search_button'))

WebUI.click(findTestObject('DMS_FINA_CMS/FINA_CMS_MobileMgmt/FINA_CMS_MobileMgmt_view icon_button'))

WebUI.verifyElementPresent(findTestObject('DMS_FINA_CMS/FINA_CMS_MobileMgmt/Inquiry/FINA_CMS_MobileMgmt_Inquiry_FullName_Textbox'), 
    1)

WebUI.verifyElementPresent(findTestObject('DMS_FINA_CMS/FINA_CMS_MobileMgmt/Inquiry/FINA_CMS_MobileMgmt_Inquiry_Email_Textbox'), 
    1)

WebUI.verifyElementPresent(findTestObject('DMS_FINA_CMS/FINA_CMS_MobileMgmt/Inquiry/FINA_CMS_MobileMgmt_Inquiry_Status_Textbox'), 
    1)

WebUI.verifyElementPresent(findTestObject('DMS_FINA_CMS/FINA_CMS_MobileMgmt/Inquiry/FINA_CMS_MobileMgmt_Inquiry_Type_Textbox'), 
    1)

WebUI.verifyElementPresent(findTestObject('DMS_FINA_CMS/FINA_CMS_MobileMgmt/Inquiry/FINA_CMS_MobileMgmt_Inquiry_Updatedby_Textbox'), 
    1)

WebUI.verifyElementPresent(findTestObject('DMS_FINA_CMS/FINA_CMS_MobileMgmt/Inquiry/FINA_CMS_MobileMgmt_Inquiry_Updatedate_Textbox'), 
    1)

'view dan verifikasi detail user'
WebUI.takeFullPageScreenshot()

