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
import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper as MobileElementCommonHelper
import io.appium.java_client.MobileElement as MobileElement

'Get directory project'
String baseDir = System.getProperty('user.dir')

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.ResvBPKBURL)

WebUI.delay(2)

WebUI.setText(findTestObject('DMS_FINA_CMS/Aplikasi Resrv BPKB/ResrvBPKB_username_text'), 'itproject')

WebUI.setText(findTestObject('DMS_FINA_CMS/Aplikasi Resrv BPKB/ResrvBPKB_pass_text'), 'mobile123+')

WebUI.click(findTestObject('DMS_FINA_CMS/Aplikasi Resrv BPKB/RsrvBPKB_Login_Button'))

WebUI.click(findTestObject('DMS_FINA_CMS/Aplikasi Resrv BPKB/ResrvBPKB_Report_Button'))

WebUI.click(findTestObject('DMS_FINA_CMS/Aplikasi Resrv BPKB/ResrvBPKB_Report_PengambilanBPKB_Button'))

WebUI.click(findTestObject('DMS_FINA_CMS/Aplikasi Resrv BPKB/Report_PengambilanBPKB_Lokasi_Dropdown'))

WebUI.delay(3)

WebUI.click(findTestObject('DMS_FINA_CMS/Aplikasi Resrv BPKB/Report_Pengambilan_BPKB_KantorPusat_Dropdownval'))

