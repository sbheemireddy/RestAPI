package test;

import java.util.Arrays;
import java.util.List;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;




public class program1Execute extends JUnitStories {
	 
	 @Override
	    public Configuration configuration() {
	        return new MostUsefulConfiguration()
	            // where to find the stories
	            .useStoryLoader(new LoadFromClasspath(this.getClass()))  
	            // CONSOLE and TXT reporting
	            .useStoryReporterBuilder(new StoryReporterBuilder().withDefaultFormats().withFormats(Format.CONSOLE, Format.TXT)); 
	    }
	 
	    // Here we specify the steps classes
	    @Override
	    public InjectableStepsFactory stepsFactory() {        
	        // varargs, can have more that one steps classes
	        return new InstanceStepsFactory(configuration(), new program1());
	    }

		@Override
		protected List<String> storyPaths() {
			// TODO Auto-generated method stub
			return Arrays.asList("test.story");
		}
	
	
	
   /* @Override
    public Configuration configuration() {
        return new MostUsefulConfiguration()
          .useStoryLoader(new LoadFromClasspath(this.getClass()))
          .useStoryReporterBuilder(new StoryReporterBuilder()
            .withCodeLocation(codeLocationFromClass(this.getClass()))
            .withFormats(CONSOLE));
    }
 
    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), new program1());
    }
 
    @Override
    protected List<String> storyPaths() {
        return Arrays.asList("increase.story");
    } */
 
}