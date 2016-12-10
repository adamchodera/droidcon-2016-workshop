package pl.com.chodera.continuousdeliverywithease;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

import org.junit.Rule;
import org.junit.Test;

import android.content.res.Resources;
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
  public void shouldDisplayWelcomeUserText() {
    Resources res = getInstrumentation().getTargetContext().getResources();
    String welcomeUserText = res.getString(R.string.activity_main_welcome_user_text); // get a string resource

    Espresso.onView(ViewMatchers.withId(R.id.id_text_view))
        .check(matches(withText(welcomeUserText)));
  }
}