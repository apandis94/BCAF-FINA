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

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathapplyonline) + 'Data Konsumen 1') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('APN_Apply Online/Data Konsumen/1.1 Button Upload File KTP'), 0)

Mobile.tap(findTestObject('APN_Apply Online/Data Konsumen/1.2 Pilih Upload dari Gallery'), 0)

not_run: Mobile.scrollToText('Upload File')

Mobile.tap(findTestObject('APN_Apply Online/Data Konsumen/Go Gallery/Go Gallery - Folder Download'), 0)

Mobile.tap(findTestObject('APN_Apply Online/Data Konsumen/Go Gallery/Go - File KTP'), 0)

Mobile.tap(findTestObject('APN_Apply Online/Data Konsumen/1.5 Button Upload File KTP Pasangan'), 0)

Mobile.tap(findTestObject('APN_Apply Online/Data Konsumen/1.2 Pilih Upload dari Gallery'), 0)

not_run: Mobile.scrollToText('Upload File')

Mobile.tap(findTestObject('APN_Apply Online/Data Konsumen/Go Gallery/Go Gallery - Folder Download'), 0)

Mobile.tap(findTestObject('APN_Apply Online/Data Konsumen/Go Gallery/Go - File KTP Pasangan'), 0)

Mobile.tap(findTestObject('APN_Apply Online/Data Konsumen/1.8 Button Upload File KK'), 0)

Mobile.tap(findTestObject('APN_Apply Online/Data Konsumen/1.2 Pilih Upload dari Gallery'), 0)

not_run: Mobile.scrollToText('Upload FIle')

Mobile.tap(findTestObject('APN_Apply Online/Data Konsumen/Go Gallery/Go Gallery - Folder Download'), 0)

Mobile.tap(findTestObject('APN_Apply Online/Data Konsumen/Go Gallery/Go - File KK'), 0)

Mobile.tap(findTestObject('APN_Apply Online/Data Konsumen/1.11 Button Upload File NPWP'), 0)

Mobile.tap(findTestObject('APN_Apply Online/Data Konsumen/1.2 Pilih Upload dari Gallery'), 0)

not_run: Mobile.scrollToText('Upload File')

Mobile.tap(findTestObject('APN_Apply Online/Data Konsumen/Go Gallery/Go Gallery - Folder Download'), 0)

Mobile.tap(findTestObject('APN_Apply Online/Data Konsumen/Go Gallery/Go - File NPWP'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathapplyonline) + 'Data Konsumen 2') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('APN_Apply Online/Data Konsumen/1.15 Button Lanjut'), 0)

WebUI.delay(15)

Mobile.setText(findTestObject('APN_Apply Online/Data Konsumen/AVD Upload Gallery/Nama'), findTestData('Data_Konsumen_ApplyOnline').getObjectValue(
        'Nama', 1), 0)

Mobile.setText(findTestObject('APN_Apply Online/Data Konsumen/AVD Upload Gallery/Alamat'), findTestData('Data_Konsumen_ApplyOnline').getObjectValue(
        'Alamat', 1), 0)

Mobile.setText(findTestObject('APN_Apply Online/Data Konsumen/AVD Upload Gallery/Provinsi'), findTestData('Data_Konsumen_ApplyOnline').getObjectValue(
        'Provinsi', 1), 0)

Mobile.setText(findTestObject('APN_Apply Online/Data Konsumen/AVD Upload Gallery/Kabupaten'), findTestData('Data_Konsumen_ApplyOnline').getObjectValue(
        'Kabupaten', 1), 0)

Mobile.setText(findTestObject('APN_Apply Online/Data Konsumen/AVD Upload Gallery/Kode Pos'), findTestData('Data_Konsumen_ApplyOnline').getObjectValue(
        'Kode Pos', 1), 0)

Mobile.setText(findTestObject('APN_Apply Online/Data Konsumen/AVD Upload Gallery/No Telp1'), findTestData('Data_Konsumen_ApplyOnline').getObjectValue(
        'No Telp1', 1), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathapplyonline) + 'Data Konsumen 3') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Keterangan', FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('APN_Apply Online/Data Konsumen/AVD Upload Gallery/No Rekening'), findTestData('Data_Konsumen_ApplyOnline').getObjectValue(
        'No Rekening', 1), 0)

Mobile.setText(findTestObject('APN_Apply Online/Data Konsumen/AVD Upload Gallery/Keterangan'), findTestData('Data_Konsumen_ApplyOnline').getObjectValue(
        'Keterangan', 1), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathapplyonline) + 'Data Konsumen 4') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('APN_Apply Online/Data Konsumen/1.22 Button Lanjut 2'), 0)

