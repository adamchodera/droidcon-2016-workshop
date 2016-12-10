package pl.com.chodera.continuousdeliverywithease;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

import org.junit.Rule;
import org.junit.Test;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;

/**
 * Created by adam on 10.12.2016.
 */

public class MainActivityTest {

  @Rule
  public ActivityTestRule<MainActivity> rule = new ActivityTestRule<>(MainActivity.class);

  @Test
  public void shouldDisplayHelloWorld() {
    Espresso.onView(ViewMatchers.withId(R.id.id_text_view))
        .check(matches(withText(""));

  }
}
