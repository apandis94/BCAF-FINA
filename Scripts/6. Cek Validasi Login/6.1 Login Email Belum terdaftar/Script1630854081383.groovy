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

String baseDir = System.getProperty('user.dir')

Mobile.startExistingApplication('com.vq.mbrochuregp.client.android', FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.delay(10)

not_run: Mobile.tap(findTestObject('YEP_FINA_Mobile/Cek Validasi Login/Main Menu Account'), 0)

not_run: Mobile.delay(2)

not_run: Mobile.takeScreenshot(((baseDir + GlobalVariable.sspathcekvalidasilogin) + 'Halaman Login') + '.png')

not_run: Mobile.tap(findTestObject('YEP_FINA_Mobile/Cek Validasi Login/Email Login'), 0)

Mobile.setText(findTestObject('YEP_FINA_Mobile/Cek Validasi Login/Email Login'), email, 0)

Mobile.setText(findTestObject('YEP_FINA_Mobile/Cek Validasi Login/Password Login'), password, 0)

Mobile.tap(findTestObject('YEP_FINA_Mobile/Cek Validasi Login/Button Login'), 0)

Mobile.delay(2)

Mobile.takeScreenshot(((baseDir + GlobalVariable.sspathcekvalidasilogin) + 'Validasi Login') + '.png')
