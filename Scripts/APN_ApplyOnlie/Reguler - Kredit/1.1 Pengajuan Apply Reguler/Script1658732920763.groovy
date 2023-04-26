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

CucumberKW.comment('Halaman Homescreen')

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathapplyonline) + 'Homescreen') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('APN_Apply Online/App Fina Revamp/Button Lainnya'), 0)

CucumberKW.comment('Halaman Apple Reguler & Miini For Max')

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathapplyonline) + 'Homescreen Apply Reguler') + '.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('APN_Apply Online/App Fina Revamp/Button Lainnya - Simulasi Kredit'), 0)

CucumberKW.comment('Loan Data Kendaraan')

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathapplyonline) + 'Pengajuan Reguler 1') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('APN_Apply Online/Pengajuan Reguler/1.3 Button Menu Kondisi Kendaraan New'), 0)

not_run: Mobile.tap(findTestObject('APN_Apply Online/Pengajuan Reguler/1.4 Button Menu Kondisi Kendaraan Used'), 0)

Mobile.setText(findTestObject('APN_Apply Online/Pengajuan Reguler/1.5 Input Harga Kendaraan'), '500,000,000', 0)

Mobile.setText(findTestObject('APN_Apply Online/Pengajuan Reguler/1.6 Input DP Awal'), '35', 0)

Mobile.tap(findTestObject('APN_Apply Online/Pengajuan Reguler/1.7 Pilih Asuransi'), 0)

Mobile.tap(findTestObject('APN_Apply Online/Pengajuan Reguler/1.8.1 Type Asuransi Comprehensive'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathapplyonline) + 'Pengajuan Reguler 2') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(0, 800, 0, 500)

Mobile.tap(findTestObject('APN_Apply Online/Pengajuan Reguler/1.9 Pilih Zona Lokasi'), 0)

Mobile.tap(findTestObject('APN_Apply Online/Pengajuan Reguler/1.10.1 Zona Jakarta, Jawa Barat dan Banten'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathapplyonline) + 'Pengajuan Reguler 3') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('APN_Apply Online/Pengajuan Reguler/1.11 Button Simulasi Kredit'), 0)

CucumberKW.comment('Halaman Detail Angsuran Didepan')

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Kredt - Angsuran Dimuka/AM Tenor 1'), AM_Tenor_1, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Kredt - Angsuran Dimuka/AM DP 1'), AM_DP_1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Kredt - Angsuran Dimuka/AM Angsuran 1'), AM_Angsuran_1, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Kredt - Angsuran Dimuka/AM Tenor 2'), AM_Tenor_2, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Kredt - Angsuran Dimuka/AM DP 2'), AM_DP_2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Kredt - Angsuran Dimuka/AM Angsuran 2'), AM_Angsuran_2, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Kredt - Angsuran Dimuka/AM Tenor 3'), AM_Tenor_3, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Kredt - Angsuran Dimuka/AM DP 3'), AM_DP_3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Kredt - Angsuran Dimuka/AM Angsuran 3'), AM_Angsuran_3, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Kredt - Angsuran Dimuka/AM Tenor 4'), AM_Tenor_4, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Kredt - Angsuran Dimuka/AM DP 4'), AM_DP_4, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Kredt - Angsuran Dimuka/AM Angsuran 4'), AM_Angsuran_4, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Kredt - Angsuran Dimuka/AM Tenor 5'), AM_Tenor_5, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Kredt - Angsuran Dimuka/AM DP 5'), AM_DP_5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Kredt - Angsuran Dimuka/AM Angsuran 5'), AM_Angsuran_5, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Kredt - Angsuran Dimuka/AM Angsuran 5 1'), AM_Angsuran_5_1, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Kredt - Angsuran Dimuka/AM Tenor 6'), AM_Tenor_6, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Kredt - Angsuran Dimuka/AM DP 6'), AM_DP_6, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Kredt - Angsuran Dimuka/AM Angsuran 6'), AM_Angsuran_6, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Kredt - Angsuran Dimuka/AM Angsuran 6 1'), AM_Angsuran_6_1, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathapplyonline) + 'Pengajuan Reguler 4') + '.png', FailureHandling.STOP_ON_FAILURE)

CucumberKW.comment('Halaman Detail Angsuran Dibelakang')

Mobile.tap(findTestObject('APN_Apply Online/Pengajuan Reguler/1.12 Button Angsuran Dibelakang'), 0)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Kredit - Angsuran Dibelakang/AB Tenor 1'), AB_Tenor_1, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Kredit - Angsuran Dibelakang/AB DP 1'), AB_DP_1, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Kredit - Angsuran Dibelakang/AB Angsuran 1'), AB_Angsuran_1, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Kredit - Angsuran Dibelakang/AB Tenor 2'), AB_Tenor_2, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Kredit - Angsuran Dibelakang/AB DP 2'), AB_DP_2, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Kredit - Angsuran Dibelakang/AB Angsuran 2'), AB_Angsuran_2, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Kredit - Angsuran Dibelakang/AB Tenor 3'), AB_Tenor_3, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Kredit - Angsuran Dibelakang/AB DP 3'), AB_DP_3, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Kredit - Angsuran Dibelakang/AB Angsuran 3'), AB_Angsuran_3, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Kredit - Angsuran Dibelakang/AB Tenor 4'), AB_Tenor_4, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Kredit - Angsuran Dibelakang/AB DP 4'), AB_DP_4, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Kredit - Angsuran Dibelakang/AB Angsuran 4'), AB_Angsuran_4, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Kredit - Angsuran Dibelakang/AB Tenor 5'), AB_Tenor_5, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Kredit - Angsuran Dibelakang/AB DP 5'), AB_DP_5, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Kredit - Angsuran Dibelakang/AB Angsuran 5'), AB_Angsuran_5, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Kredit - Angsuran Dibelakang/AB Angsuran 5 1'), 
    AB_Angsuran_5_1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Kredit - Angsuran Dibelakang/AB Tenor 6'), AB_Tenor_6, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Kredit - Angsuran Dibelakang/AB DP 6'), AB_DP_6, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Kredit - Angsuran Dibelakang/AB Angsuran 6'), AB_Angsuran_6, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('APN_Apply Online/Verify Element/Kredit - Angsuran Dibelakang/AB Angsuran 6 1'), 
    AB_Angsuran_6_1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathapplyonline) + 'Pengajuan Reguler 5') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('APN_Apply Online/Pengajuan Reguler/1.13 Pilih Tenor 4Thn'), 0)

CucumberKW.comment('Halaman Detail Angsuran Perbulan')

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathapplyonline) + 'Pengajuan Reguler 6') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('APN_Apply Online/Pengajuan Reguler/1.14 Button Pengajuan'), 0)

