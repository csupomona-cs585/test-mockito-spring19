package edu.cpp.cs585.mockitotest;

import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
public class AccountManagerTest {

	@Test
	public void testListAllAccounts() {
		AccountManager accountManager = mock(AccountManager.class);
		
		when(accountManager.listAllUsers())
				.thenReturn(Arrays.asList(new String[] {"132", "456", "789"}));		
		List<String> accounts = accountManager.listAllUsers();
		System.out.println(accounts);
		Assert.assertTrue(accounts.size() > 0);
	}
	
	@Test(expected = RuntimeException.class)
	public void testListAllAccountsAlwaysFails() {
		AccountManager accountManager = mock(AccountManager.class);
		
		when(accountManager.listAllUsers())
				.thenThrow(new RuntimeException("Failed to connect to the DB"));
		
		List<String> accounts = accountManager.listAllUsers();		
	}
}
