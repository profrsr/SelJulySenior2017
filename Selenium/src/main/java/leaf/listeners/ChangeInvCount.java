package leaf.listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class ChangeInvCount implements IAnnotationTransformer{

	public void transform(ITestAnnotation annotation, Class testClass,
			Constructor testConstructor, Method testMethod) {
		if(testMethod.getName().equals("createLead"))
			annotation.setInvocationCount(1);
		
		if(testMethod.getName().equals("editLead"))
			annotation.setEnabled(false);
	}

}
