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



class US1 {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@When("the user navigates to the map")
	def the_user_navigates_to_the_map() {
		Mobile.tap(findTestObject(GlobalVariable.HamburguerButton), 0)
		Mobile.tap(findTestObject(GlobalVariable.HamburguerMapMenu), 0)
	}

	@Then("the user verifies the map exists")
	def the_user_verifies_the_map_exists() {
		Mobile.verifyElementExist(findTestObject(GlobalVariable.MapMenu), 0)
	}

	@And("the user verifies the measurements option tab exist")
	def the_user_verifies_the_measurements_option_tab_exist() {
		Mobile.verifyElementExist(findTestObject(GlobalVariable.MapOptionTab), 0)
	}

	@And("the user verifies the tab option local exist")
	def the_user_verifies_the_tab_option_local_exist() {
		Mobile.verifyElementExist(findTestObject(GlobalVariable.TabOptionLocal), 0)
	}

	@And("the user verifies the tab option shared exist")
	def the_user_verifies_the_tab_option_shared_exist() {
		Mobile.verifyElementExist(findTestObject(GlobalVariable.TabOptionShared), 0)
	}
}