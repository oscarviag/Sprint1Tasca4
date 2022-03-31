package n2exercici1;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ExecucioTest {
	
	
	
	@Test
	@DisplayName("Comprova el tamany d'un String")
	void tamanyString() {
		
				assertThat("Mordor", longitud(is(8)));
	}
			
	public static Matcher<String> longitud(Matcher<? super Integer> matcher) {
		
		return new FeatureMatcher<String, Integer>(matcher, "S'esperava una longitud de String ", "la longitud") {
			
			@Override
			protected Integer featureValueOf(String actual) {
				
			        System.out.println(actual.length());
			        
			        return actual.length();
			}
		};
	}
	
	
	
}

 
