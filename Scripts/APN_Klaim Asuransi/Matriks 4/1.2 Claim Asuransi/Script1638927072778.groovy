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

Mobile.startExistingApplication('com.vq.mbrochuregp.client.android', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('APN_FINA_ClaimAsuransi/Claim Asuransi/android.widget.LinearLayout (More Menu)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathklaimasuransi) + 'CA Proses 1') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('APN_FINA_ClaimAsuransi/Claim Asuransi/android.widget.ImageView(Claim Asuransi)'), 0)

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathklaimasuransi) + 'CA Proses 2') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('APN_FINA_ClaimAsuransi/Claim Asuransi/android.view.View(ListKlaimAsuransi)'), 0)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathklaimasuransi) + 'CA Proses 3') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('APN_FINA_ClaimAsuransi/Claim Asuransi/android.widget.EditText(NoTelp)'), findTestData('APN_Claim_Assurance').getObjectValue(
        'No tlp', 16), 0)

Mobile.tap(findTestObject('APN_FINA_ClaimAsuransi/Claim Asuransi/android.widget.Spinner(SetTanggalKejadian)'), 0)

Mobile.tap(findTestObject('APN_FINA_ClaimAsuransi/Claim Asuransi/android.view.View - 12(tangal Klik)'), 0)

Mobile.tap(findTestObject('APN_FINA_ClaimAsuransi/Claim Asuransi/android.widget.Button - SETEL(klik)'), 0)

Mobile.tap(findTestObject('APN_FINA_ClaimAsuransi/Claim Asuransi/android.widget.CheckBox(Tick)'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathklaimasuransi) + 'CA Proses 4') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(0, 700, 0, 400)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathklaimasuransi) + 'CA Proses 5') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.pressBack()

Mobile.closeApplication()

