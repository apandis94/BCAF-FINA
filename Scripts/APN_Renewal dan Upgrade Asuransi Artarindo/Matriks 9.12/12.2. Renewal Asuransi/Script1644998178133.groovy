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

Mobile.tap(findTestObject('APN_FINA_MOBILE/Homescreen/Button Menu Lainnya'), 0)

Mobile.tap(findTestObject('APN_FINA_MOBILE/Homescreen/Button Renewal'), 0)

Mobile.delay(15)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathasuransiraksa) + 'skenario-12.3-list kendaraan') + '.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('APN_Fina New Versi/List Data/Renewal 1-2'), 0)

Mobile.delay(10)

'start'

'Get Device Height and Store in device_height variable'
device_Height = Mobile.getDeviceHeight()

'Get Width Height and Store in device_Width variable'
device_Width = Mobile.getDeviceWidth()

'Storing the startX value by dividing device width by 2. Because x coordinates are constant for Vertical Swiping'
int startX = device_Width / 2

'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX'
int endX = startX

'Storing the startY value'
int startY = device_Height * 0.30

'Storing the endY value'
int endY = device_Height * 0.70

'Swipe Vertical from top to bottom'
Mobile.swipe(startX, endY, endX, startY)

Mobile.comment('end')

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Renewal_Asuransi/FINA_RenewalAsr_DetailAsr_TLO 1thn_Radiobutton'), 0)

Mobile.delay(2)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathasuransiraksa) + 'skenario-12.4-submit renewal') + '.png', 
    FailureHandling.STOP_ON_FAILURE)

MobileElement Lanjutkan = MobileElementCommonHelper.findElement(findTestObject('DMS_FINA_Mobile/FINA_Renewal_Asuransi/FINA_RenewalAsr_DetailAsr_Lanjutkan_Button'), 
    10)

Lanjutkan.click()

Mobile.setText(findTestObject('APN_FINA_MOBILE/Homescreen/Input No Telp Renewal'), '087843562111', 0)

Mobile.delay(10)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathasuransiraksa) + 'skenario-12.5-konfirmasi renewal') + 
    '.png', FailureHandling.STOP_ON_FAILURE)

MobileElement Submit = MobileElementCommonHelper.findElement(findTestObject('DMS_FINA_Mobile/FINA_Renewal_Asuransi/FINA_RenewalAsr_DetailAsr_Submit_Button'), 
    10)

Submit.click()

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Renewal_Asuransi/FINA_RenewalAsr_Submit_Ya_Button'), 0)

Mobile.delay(10)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathasuransiraksa) + 'skenario-12.6-proses submit berhasil') + 
    '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('DMS_FINA_Mobile/FINA_Renewal_Asuransi/FINA_RenewalAsr_Submit_Kembali_Button'), 0)

Mobile.pressBack()

Mobile.pressBack()

MobileElement Account = MobileElementCommonHelper.findElement(findTestObject('Object Repository/DMS_FINA_Mobile/FINA_BottomNav_Account_Button'), 
    10)

Account.click()

Mobile.delay(5)

