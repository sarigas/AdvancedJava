/**
 * 
 */
package fr.tbr.junit.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.tbr.iam.User;

/**
 * @author tbrou
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/applicationContext.xml")
public class TestSpring {
	
	@Autowired
	User user;
	
	@Test
	public void testUserIsNotNull(){
		System.out.println(user.getFirstName());
	}
	
	
	

}
