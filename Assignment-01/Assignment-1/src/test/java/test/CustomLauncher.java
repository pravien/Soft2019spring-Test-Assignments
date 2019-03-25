package test;

import static org.junit.platform.engine.discovery.ClassNameFilter.includeClassNamePatterns;
import static org.junit.platform.engine.discovery.DiscoverySelectors.selectClass;
import static org.junit.platform.engine.discovery.DiscoverySelectors.selectPackage;
import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.TestPlan;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pravien
 */
public class CustomLauncher {

    public static void main(String[] args) {

        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
                .selectors(
                        selectPackage("test"),
                        selectClass(NewEmptyJUnitTest.class)
                )
                .build();

        Launcher launcher = LauncherFactory.create();

        TestPlan testPlan = launcher.discover(request);
        SummaryGeneratingListener listener = new SummaryGeneratingListener();
        launcher.registerTestExecutionListeners(listener);

        launcher.execute(request);
        System.out.println("Test plan --- "+testPlan.containsTests());          
        System.out.println("Test found --- "+listener.getSummary().getTestsFoundCount());
        System.out.println("Passed test --- "+listener.getSummary().getTestsSucceededCount());
        System.out.println("Failed test --- "+listener.getSummary().getTotalFailureCount());
    }
}
