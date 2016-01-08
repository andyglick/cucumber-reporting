package net.masterthought.cucumber;

import org.junit.Ignore;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author glick
 */
@SuppressWarnings("ConstantConditions")
public class ReportBuilderDemoTest
{
  @Test
  public void testZucchiniJson() throws URISyntaxException, IOException
  {
    @SuppressWarnings({"unused"})
    File rd = new File(ReportBuilderDemoTest.class.getClassLoader().getResource("net/masterthought/cucumber").toURI());
    List<String> jsonReports = new ArrayList<>();

    jsonReports.add(new File(ReportBuilderTest.class.getClassLoader().getResource("net/masterthought/cucumber/zucchini.json").toURI()).getAbsolutePath());
    ReportBuilder reportBuilder = new ReportBuilder(jsonReports, rd, "", "1", "Zucchini", false, false, false, false, true, true, false,
      false);
    reportBuilder.generateReports();
  }

  @Test
  // @Ignore
  public void testTopNgJson() throws URISyntaxException, IOException
  {
    @SuppressWarnings({"unused"})
    File rd = new File(ReportBuilderDemoTest.class.getClassLoader().getResource("net").toURI());
    List<String> jsonReports = new ArrayList<>();

    // jsonReports.add(new File(ReportBuilderTest.class.getClassLoader().getResource("net/masterthought/cucumber/top-ng-it.json").toURI()).getAbsolutePath());
    jsonReports.add(new File(ReportBuilderTest.class.getClassLoader().getResource("topng/cucumber-partition-1.json").toURI()).getAbsolutePath());
    jsonReports.add(new File(ReportBuilderTest.class.getClassLoader().getResource("topng/cucumber-partition-2.json").toURI()).getAbsolutePath());
    jsonReports.add(new File(ReportBuilderTest.class.getClassLoader().getResource("topng/cucumber-partition-3.json").toURI()).getAbsolutePath());

    ReportBuilder reportBuilder = new ReportBuilder(jsonReports, rd, "", "1", "TopNG UI -- Cucumber Testing Results", false, false, false, false, true, false,
      false, false);
    reportBuilder.generateReports();
  }


}
