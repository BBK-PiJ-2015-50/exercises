boolean isAPalindrome (String text) {
	if (text.length() <= 1) {
		return true
	} else if (text.charAt(0) == text.charAt(text.length() - 1)) {
		return isAPalindrome (text.substring(1, text.length() - 1))
	} else {
		return false
	}
}

print ("Enter text to check if it's a palindrome: ")
println isAPalindrome(System.console().readLine()) ? "Yes it's a palindrome" : "No it's not a palindrome"