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

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathapplyonline) + 'Homescreen') + '.png', FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'fina.klikbutton.buttonlain'()

CucumberKW.comment('Input Loan Data - Simulasi Budget')

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathapplyonline) + 'Simulasi Budget 1') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('APN_Apply Online/1.2.1 Kondisi Kendaraan New'), 0)

'Jika Input Kendaraan dengan kondisi used/second'
not_run: Mobile.tap(findTestObject('APN_Apply Online/1.2.2 Kondisi Kendaraan Used'), 0)

'input tahun kendaraan second'
not_run: Mobile.setText(findTestObject('APN_Apply Online/1.16 Input Tahun Kendaraan Untuk Kondisi Used'), '2017', 0)

Mobile.setText(findTestObject('APN_Apply Online/1.3 Input Harga Kendaraan'), '500,000,000', 0)

Mobile.tap(findTestObject('APN_Apply Online/1.5 Radio Button Hitung Simulasi Berdasarkan'), 0)

Mobile.tap(findTestObject('APN_Apply Online/1.6.1 Pilih Type Total Bayar Pertama'), 0)

Mobile.setText(findTestObject('APN_Apply Online/1.7.1 Input Total Pembayaran Pertama'), '200,000,000', 0)

'untuk pilih tipe pencarian pertama'
not_run: Mobile.tap(findTestObject('APN_Apply Online/1.6.2 Pilih Tipe Pencarian Angsuran'), 0)

'Input Anggsuran pertama jika pilih tipe pencarian angsuran'
not_run: Mobile.setText(findTestObject('APN_Apply Online/1.7.2 Input Nominal Angsuran'), '150,000,000', 0)

Mobile.tap(findTestObject('APN_Apply Online/1.8 Radio Button Pilih Asuransi'), 0)

Mobile.tap(findTestObject('APN_Apply Online/1.9.1 Pilih Asuransi Comprehensive'), 0)

not_run: Mobile.tap(findTestObject('APN_Apply Online/1.9.2 Pilih Asuransi Combine'), 0, FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.tap(findTestObject('APN_Apply Online/1.9.3 Pilih Asuransi TLO'), 0)

Mobile.tap(findTestObject('APN_Apply Online/1.10 Radio Button Zona Wilayah'), 0)

Mobile.tap(findTestObject('APN_Apply Online/1.11.1 Zona Wilayah Jakarta, Jawa Barat dan Banten'), 0)

not_run: Mobile.tap(findTestObject('APN_Apply Online/1.11.2 Zona Wilayah Lain-Lainnya'), 0)

not_run: Mobile.tap(findTestObject('APN_Apply Online/1.11.3 Zona Wilayah Sumatera dan Sekitarnya'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathapplyonline) + 'Simulasi Budget 2') + '.png', FailureHandling.STOP_ON_FAILURE)

'Kondisi Kendaraan Used'
not_run: Mobile.scrollToText('Simulasi Budget', FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(0, 800, 0, 500, FailureHandling.CONTINUE_ON_FAILURE)

'Kondisi Kendaraan Used'
Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

'Kondisi Kendaraan Used'
Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathapplyonline) + 'Simulasi Budget 3') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('APN_Apply Online/1.12 Button Simulasi Budget'), 0)

CucumberKW.comment('Angsuran Dimuka')

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Budget - Angsuran Dimuka/Angsuran Dimuka - Tenor 1'), AM_Tenor_1, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Budget - Angsuran Dimuka/Angsuran Dimuka - Total Dp 1'), 
    AM_DP_1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Budget - Angsuran Dimuka/Angsuran Dimuka - Angsuran 1'), 
    AM_Angsuran_1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Budget - Angsuran Dimuka/Angsuran Dimuka - Tenor 2'), AM_Tenor_2, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Budget - Angsuran Dimuka/Angsuran Dimuka - Total Dp 2'), 
    AM_DP_2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Budget - Angsuran Dimuka/Angsuran Dimuka - Angsuran 2'), 
    AM_Angsuran_2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Budget - Angsuran Dimuka/Angsuran Dimuka - Tenor 3'), AM_Tenor_3, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Budget - Angsuran Dimuka/Angsuran Dimuka - Total Dp 3'), 
    AM_DP_3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Budget - Angsuran Dimuka/Angsuran Dimuka - Angsuran 3'), 
    AM_Angsuran_3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Budget - Angsuran Dimuka/Angsuran Dimuka - Tenor 4'), AM_Tenor_4, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Budget - Angsuran Dimuka/Angsuran Dimuka - Total Dp 4'), 
    AM_DP_4, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Budget - Angsuran Dimuka/Angsuran Dimuka - Angsuran 4'), 
    AM_Angsuran_4, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathapplyonline) + 'Simulasi Budget 4') + '.png', FailureHandling.STOP_ON_FAILURE)

CucumberKW.comment('Angsuran Dibelakang')

Mobile.tap(findTestObject('APN_Apply Online/1.13 Button Angsuran Dibelakang'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathapplyonline) + 'Simulasi Budget 5') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('APN_Apply Online/1.14 Pilih Tennor 4Thn'), 0)

CucumberKW.comment('Rincian Angsuran')

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathapplyonline) + 'Simulasi Budget 6') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('APN_Apply Online/1.15 Button Pengajuan - Ajukan'), 0)

