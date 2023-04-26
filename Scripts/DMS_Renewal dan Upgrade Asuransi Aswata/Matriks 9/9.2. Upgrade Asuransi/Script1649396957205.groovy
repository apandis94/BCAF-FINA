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

Mobile.startExistingApplication('com.vq.mbrochuregp.client.android', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(8)

Mobile.pressBack()

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Login/android.widget.Button - TIDAK'), 0)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Mobile_Main Menu/FINA_Menu_More_Button'), 0)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Menu_More Menu/Features/FINA_More_UpgradeAsr_Button'), 0)

Mobile.delay(30)

Mobile.tap(findTestObject('APN_Fina New Versi/List Data/Upgrade 1-1'), 0)

Mobile.delay(10)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathasuransicakpro) + 'skenario-9.3-list kendaraan') + '.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathasuransicakpro) + 'skenario-9.4-pilih tenor') + '.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Upgrade_Asuransi/FINA_UpgradeAsr_Detail_Back_Button'), 0)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Upgrade_Asuransi/FINA_UpgradeAsr_Back_Button'), 0)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Menu_More Menu/FINA_More_Back_Button'), 0)

Mobile.pressBack()

Mobile.pressBack()

