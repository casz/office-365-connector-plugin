package jenkins.plugins.office365connector;

import org.jenkinsci.plugins.workflow.cps.CpsFlowDefinition;
import org.jenkinsci.plugins.workflow.job.WorkflowJob;
import org.junit.Rule;
import org.junit.Test;
import org.jvnet.hudson.test.JenkinsRule;

public class WebhookJobPropertyTest {

    @Rule
    public JenkinsRule rule = new JenkinsRule();

    @Test
    public void roundtrip() throws Exception {
        WorkflowJob p = rule.jenkins.createProject(WorkflowJob.class, "p");
        p.setDefinition(new CpsFlowDefinition());
    }
}
