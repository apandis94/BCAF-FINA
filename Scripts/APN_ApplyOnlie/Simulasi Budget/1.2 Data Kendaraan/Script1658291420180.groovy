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

'Get directory project'
String baseDir = System.getProperty('user.dir')

Mobile.startExistingApplication('com.vq.mbrochuregp.client.android')

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathapplyonline) + 'Data Kenaraan 1') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('APN_Apply Online/Data Kendaraan/1.1 Radio Button Pilih Merk Kendaraan'), 0)

Mobile.setText(findTestObject('APN_Apply Online/Data Kendaraan/1.2 Input Merk Kendaraan'), 'Honda', 0)

Mobile.tap(findTestObject('APN_Apply Online/Data Kendaraan/1.3 Pilih Merk Kendaraan'), 0)

Mobile.tap(findTestObject('APN_Apply Online/Data Kendaraan/1.4 Radio Button Pilih Model Kendaraan'), 0)

Mobile.tap(findTestObject('APN_Apply Online/Data Kendaraan/1.5 Pilih Model Kendaraan'), 0)

Mobile.setText(findTestObject('APN_Apply Online/Data Kendaraan/1.6 Input Type Kendaraan'), 'TIPE - RR', 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathapplyonline) + 'Data Kenaraan 2') + '.png', FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.tap(findTestObject('APN_Apply Online/Data Kendaraan/1.6 Button Submit - Simpan'), 0)

