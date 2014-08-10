Usage
=====

### To get language tag of text 

```
        GuessLanguage gl = new GuessLanguage(getContext());
        String lang = gl.guessLanguage("नमस्कार सिल्पा की दुनिया में आपका स्वागत है");
        // lang = "hi"

```

The above function `guessLanguage(String)` returns language tag of the inputted text.


### To get language name of text 

```
        GuessLanguage gl = new GuessLanguage(getContext());
        String langName = gl.guessLanguageName("മലയാളം");
        // langName = "Malayalam"

```

The above function `guessLanguageName(String)` returns language name of the inputted text.

### To get language id of text 

```
        GuessLanguage gl = new GuessLanguage(getContext());
        int langId = gl.guessLanguageId("Verifions que le détecteur de langues marche");
        // langId = 26150

```

The above function `guessLanguageId(String)` returns language id of the inputted text.


### Language Information object

```
        GuessLanguage gl = new GuessLanguage(getContext());
        LanguageInfo info = gl.guessLanguageInfo("авай проверить  узнает ли наш угадатель русски язык");        

```

The above function `guessLanguageId(String)` returns language info object of the inputted text where

```
        info.getLanguageTag();          - returns language tag
        info.getLanguageId();           - returns language id
        info.getLanguageName();         - returns language name

```


#### To run tests
Tests present at `/src/androidTest/java/`

  - Select test to run
  - Right Click -> Run Test -> Run as Android Test

