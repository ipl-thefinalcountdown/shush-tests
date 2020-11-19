import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class US2 {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("the user has the app launched")
	def the_user_has_the_app_launched() {
		Mobile.startApplication(GlobalVariable.AppPath, false)
	}

	@When("the user enters the view")
	def the_user_enters_the_view() {
		Mobile.verifyElementExist(findTestObject(GlobalVariable.MainView), 0)
	}


	@Then("the user verifies the button is present")
	def the_user_verifies_the_button_is_present() {
		Mobile.verifyElementExist(findTestObject(GlobalVariable.SmallAudioRecordButton), 0)
	}

	@Given("the user is in the view")
	def the_user_is_in_the_view() {
		Mobile.tap(findTestObject(GlobalVariable.MainView), 0)
	}

	@When("the user clicks the small button")
	def the_user_clicks_the_small_button() {
		Mobile.tap(findTestObject(GlobalVariable.SmallAudioRecordButton), 0)
	}

	@Then("the user navigates to the audio record menu")
	def the_user_navigates_to_the_audio_record_menu() {
		Mobile.verifyElementExist(findTestObject(GlobalVariable.AudioRecordMenu), 0)
	}

	@And("the user verifies the record button is present")
	def the_user_verifies_the_recordButton_is_present() {
		Mobile.verifyElementExist(findTestObject(GlobalVariable.AudioRecordButton), 0)
	}

	@And("the user verifies the decibel counter is present")
	def the_user_verifies_the_decibelCounter_is_present() {
		Mobile.verifyElementExist(findTestObject(GlobalVariable.DecibelCounter), 0)
	}

	@And("the user verifies the chronometer is present")
	def the_user_verifies_the_chronometer_is_present() {
		Mobile.verifyElementExist(findTestObject(GlobalVariable.Chronometer), 0)
	}

	@And("the user varifies the decibel counter text is (.*)")
	def the_user_varifies_the_decibelCounter_text_is(String decibelCounterText) {
		String txt = Mobile.getText(findTestObject(GlobalVariable.DecibelCounter), 0)
		Mobile.verifyEqual(txt, decibelCounterText)
	}

	@And("the user verifies the chronometer text is (.*)")
	def the_user_verifies_the_chronometer_text_is(String chronometerText) {
		String txt = Mobile.getText(findTestObject(GlobalVariable.Chronometer), 0)
		Mobile.verifyEqual(txt, chronometerText)
	}

	@Given("the user is in the audio record menu")
	def the_user_is_in_the_audio_record_menu() {
		Mobile.tap(findTestObject(GlobalVariable.AudioRecordMenu), 0)
	}

	@When("the user clicks the record button")
	def the_user_clicks_the_recordButton() {
		Mobile.tap(findTestObject(GlobalVariable.AudioRecordButton), 0)
	}

	@Then("the user verifies the chronometer is not (.*)")
	def the_user_verifies_the_chronometer_is_not(String chronometerText) {
		String txt = Mobile.getText(findTestObject(GlobalVariable.Chronometer), 0)
		Mobile.verifyNotEqual(txt, chronometerText)
	}

	@And("the user verifies the decibel counter is not (.*)")
	def the_user_verifies_the_decibelCounter_is_not(String decibelCounterText) {
		String txt = Mobile.getText(findTestObject(GlobalVariable.DecibelCounter), 0)
		Mobile.verifyNotEqual(txt, decibelCounterText)
	}
}