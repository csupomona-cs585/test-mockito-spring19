package edu.cpp.cs585.mockitotest;

import java.util.Arrays;
import java.util.List;

public class AccountManager {

	public List<String> listAllUsers() {
		// connect to a database and return all the users
		return Arrays.asList(new String[] {"abc", "def", "ghi"});
	}
}
