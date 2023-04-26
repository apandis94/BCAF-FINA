package fina

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class verifyelement {
	@Keyword
	public void AngsuranMuka() {
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
	}
}
