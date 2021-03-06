require "selenium/client"

Given /^that I am on the browser start page$/ do
  @browser = Selenium::Client::Driver.new :host => "localhost", :port => 4444, :browser => "*firefox", :url => "http://www.google.com.br", :timeout_in_second => 60
  @browser.start_new_browser_session
end

When /^I go to the website www\.google\.com\.br$/ do
  @browser.open("http://www.google.com.br")
end

Then /^the title of page should be "([^"]*)"$/ do |title|
  assert_equal @browser.title, title
  @browser.close_current_browser_session
end
