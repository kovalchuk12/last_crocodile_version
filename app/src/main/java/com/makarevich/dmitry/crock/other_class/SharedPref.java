package com.makarevich.dmitry.crock.other_class;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.makarevich.dmitry.crock.game_dictionary.DictionaryAll;
import com.makarevich.dmitry.crock.game_dictionary.DictionaryLevel;
import com.makarevich.dmitry.crock.game_process.ComandComand_Normal;
import com.makarevich.dmitry.crock.game_process.ComandNormal;
import com.makarevich.dmitry.crock.game_process.MainMenu;
import com.makarevich.dmitry.crock.game_process.Play_Mode;
import com.makarevich.dmitry.crock.game_process.Settings;
import com.makarevich.dmitry.crock.game_process.SpalshScreen;
import com.makarevich.dmitry.crock.game_process.Time_NoTime;
import com.makarevich.dmitry.crock.game_shop.BuyCoinForCash;
import com.makarevich.dmitry.crock.game_shop.EarnCoins;
import com.makarevich.dmitry.crock.registration_and_login.Registration;

import java.util.Random;

public class SharedPref {

    public static void getDefaultSharedPreferences() {
        Context applicationContext = Registration.getContextOfApplication();
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("PLAY_MODE", "none");
        edit.putString("DICTIONARY", "none");
        edit.putString("COIN", "0");
        edit.putString("LANGUAGE", "none");
        edit.putString("DICTIONARY_PLAY", "none");
        edit.putString("DICTIONARY_PLAY", "none");
        edit.putString("LAST_SET", "none");
        edit.putString("ROUND_TIME", "20");
        //*****************************проверка подгрузки словарей******************
        edit.putString("RU_LATEST", "none");
        edit.putString("EN_LATEST", "none");
        edit.putString("ES_LATEST", "none");
        edit.putString("DE_LATEST", "none");
        //*****************************русские курсоры**************************************//
        edit.putString("RU_EASY_CURSOR", "60");
        edit.putString("RU_MEDIUM_CURSOR", "60");
        edit.putString("RU_HARD_CURSOR", "60");
        edit.putString("RU_ANIMAL_CURSOR", "5");
        edit.putString("RU_PLANET_CURSOR", "5");
        edit.putString("RU_PROFESSIONS_CURSOR", "5");
        edit.putString("RU_TRANSPORT_CURSOR", "5");
        //*****************************английские курсоры**************************************//
        edit.putString("EN_EASY_CURSOR", "60");
        edit.putString("EN_MEDIUM_CURSOR", "60");
        edit.putString("EN_HARD_CURSOR", "60");
        edit.putString("EN_ANIMAL_CURSOR", "5");
        edit.putString("EN_PLANET_CURSOR", "5");
        edit.putString("EN_PROFESSIONS_CURSOR", "5");
        edit.putString("EN_TRANSPORT_CURSOR", "5");
        //*****************************немецкие курсоры**************************************//
        edit.putString("DE_EASY_CURSOR", "60");
        edit.putString("DE_MEDIUM_CURSOR", "60");
        edit.putString("DE_HARD_CURSOR", "60");
        edit.putString("DE_ANIMAL_CURSOR", "5");
        edit.putString("DE_PLANET_CURSOR", "5");
        edit.putString("DE_PROFESSIONS_CURSOR", "5");
        edit.putString("DE_TRANSPORT_CURSOR", "5");
        //*****************************испанские курсоры**************************************//
        edit.putString("ES_EASY_CURSOR", "60");
        edit.putString("ES_MEDIUM_CURSOR", "60");
        edit.putString("ES_HARD_CURSOR", "60");
        edit.putString("ES_ANIMAL_CURSOR", "5");
        edit.putString("ES_PLANET_CURSOR", "5");
        edit.putString("ES_PROFESSIONS_CURSOR", "5");
        edit.putString("ES_TRANSPORT_CURSOR", "5");
        edit.apply();
        edit.commit();
    }
    public static String ReturnTimer() {
        Context applicationContext = Time_NoTime.getContextTimeNoTime();
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        return sharedPreferences.getString("ROUND_TIME", "");
    }

    public static void MainMenuSetNone() {
        Context applicationContext = MainMenu.getContextMainMenu();
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("LAST_SET", "none");
        edit.apply();
        edit.commit();
    }

    public static void LastSetTime() {
        Context applicationContext = Time_NoTime.getContextTimeNoTime();
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("LAST_SET", "time");
        edit.apply();
        edit.commit();
    }

    public static void LastSetNoTime() {
        Context applicationContext = Time_NoTime.getContextTimeNoTime();
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("LAST_SET", "no");
        edit.apply();
        edit.commit();
    }

    public static String ReturnLastSet() {
        Context applicationContext = Time_NoTime.getContextTimeNoTime();
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        return sharedPreferences.getString("LAST_SET", "");
    }

    public static void MainProof() {
        Context applicationContext = Registration.getContextOfApplication();
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("PROOF", "yes");
        edit.apply();
        edit.commit();
    }

    public static String ReturnMainProof() {
        Context applicationContext = Registration.getContextOfApplication();
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        @SuppressLint("CommitPrefEdits") SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("PROOF", "yes");
        return sharedPreferences.getString("PROOF", "");
    }

    public static void SplashScreenProof() {
        Context applicationContext = SpalshScreen.getContexSplashScreen();
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("LAST_GAME", "yes");
        edit.apply();
        edit.commit();
    }

    public static String SplashReturnPlay() {
        Context applicationContext = SpalshScreen.getContexSplashScreen();
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        return sharedPreferences.getString("LAST_GAME", "");
    }

    public static void getOne() {
        Context applicationContext = Play_Mode.getContextPlayMode();
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("PLAY_MODE", "one");
        edit.apply();
        edit.commit();
    }

    public static void getTwo() {
        Context applicationContext = Play_Mode.getContextPlayMode();
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("PLAY_MODE", "comand");
        edit.apply();
        edit.commit();
    }

    public static void getTree() {
        Context applicationContext = Play_Mode.getContextPlayMode();
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("PLAY_MODE", "comand_comand");
        edit.apply();
        edit.commit();
    }

    public static void getDicOne() {
        Context applicationContext = DictionaryLevel.getContexDictionary();
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("DICTIONARY", "easy");
        edit.apply();
        edit.commit();
    }

    public static void getDicTwo() {
        Context applicationContext = DictionaryLevel.getContexDictionary();
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("DICTIONARY", "medium");
        edit.apply();
        edit.commit();
    }

    public static void getDicTree() {
        Context applicationContext = DictionaryLevel.getContexDictionary();
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("DICTIONARY", "hard");
        edit.apply();
        edit.commit();
    }

    public static void Perehod() {
        Context applicationContext = DictionaryLevel.getContexDictionary();
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        String one = "one";
        String two = "comand";
        String three = "comand_comand";
        String test = sharedPreferences.getString("PLAY_MODE", "");
        if (test.contains(one)) {
            Intent first = new Intent(DictionaryLevel.getContexDictionary(), Time_NoTime.class);
            first.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            applicationContext.startActivity(first);
        }
        if (test.contains(two)) {
            Intent second = new Intent(DictionaryLevel.getContexDictionary(), ComandNormal.class);
            second.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            applicationContext.startActivity(second);
        }
        if (test.contains(three)) {
            Intent third = new Intent(DictionaryLevel.getContexDictionary(), ComandComand_Normal.class);
            third.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            applicationContext.startActivity(third);
        }
    }

    public static void Coins() {
        Context applicationContext = EarnCoins.getContexEarnCoins();
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        Random rnd = new Random(System.currentTimeMillis());
        int number = 45 + rnd.nextInt(80 - 45 + 1);
        int coin = Integer.parseInt(sharedPreferences.getString("COIN", "")) + number;
        String coin_s = String.valueOf(coin);
        edit.putString("COIN", coin_s);
        edit.apply();
        edit.commit();
    }

    public static String getCoin() {
        Context applicationContext = EarnCoins.getContexEarnCoins();
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        return sharedPreferences.getString("COIN", "");
    }

    public static String getCoinShop() {
        Context applicationContext = BuyCoinForCash.getContexCoinsCash();
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        return sharedPreferences.getString("COIN", "");
    }

    public static void LangRu() {
        Context applicationContext = Settings.getContexSetings();
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("LANGUAGE", "ru");
        edit.apply();
        edit.commit();
    }

    public static void LangEng() {
        Context applicationContext = Settings.getContexSetings();
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("LANGUAGE", "eng");
        edit.apply();
        edit.commit();
    }

    public static void LangDe() {
        Context applicationContext = Settings.getContexSetings();
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("LANGUAGE", "de");
        edit.apply();
        edit.commit();
    }

    public static void LangEsp() {
        Context applicationContext = Settings.getContexSetings();
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("LANGUAGE", "esp");
        edit.apply();
        edit.commit();
    }


    public static String getsLanguage() {
        Context applicationContext = SpalshScreen.getContexSplashScreen();
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        return sharedPreferences.getString("LANGUAGE", "");
    }


    public static void Play_Start_Easy() {
        Context applicationContext = DictionaryAll.getContexDictionaryAll();
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("DICTIONARY_PLAY", "easy");
        edit.apply();
        edit.commit();
    }

    public static void Play_Start_Medium() {
        Context applicationContext = DictionaryAll.getContexDictionaryAll();
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("DICTIONARY_PLAY", "medium");
        edit.apply();
        edit.commit();
    }

    public static void Play_Start_Hard() {
        Context applicationContext = DictionaryAll.getContexDictionaryAll();
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("DICTIONARY_PLAY", "hard");
        edit.apply();
        edit.commit();
    }

    public static void Play_Start_Mixsy() {
        Context applicationContext = DictionaryAll.getContexDictionaryAll();
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("DICTIONARY_PLAY", "mixsy");
        edit.apply();
        edit.commit();
    }

    public static void Play_Animal() {
        Context applicationContext = DictionaryAll.getContexDictionaryAll();
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("DICTIONARY_PLAY", "animal");
        edit.apply();
        edit.commit();
    }

    public static void Play_Planet() {
        Context applicationContext = DictionaryAll.getContexDictionaryAll();
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("DICTIONARY_PLAY", "planet");
        edit.apply();
        edit.commit();
    }

    public static void Play_Profession() {
        Context applicationContext = DictionaryAll.getContexDictionaryAll();
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("DICTIONARY_PLAY", "profession");
        edit.apply();
        edit.commit();
    }

    public static void Play_Kids() {
        Context applicationContext = DictionaryAll.getContexDictionaryAll();
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("DICTIONARY_PLAY", "transport");
        edit.apply();
        edit.commit();
    }


    public static void Perehod_Two() {
        Context applicationContext = DictionaryAll.getContexDictionaryAll();
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        String one = "animal";
        String two = "planet";
        String three = "profession";
        String four = "transport";
        String test_f = "one";
        String text_s = "comand";
        String text_sev = "comand_comand";
        String test = sharedPreferences.getString("DICTIONARY_PLAY", "");
        String test_two = sharedPreferences.getString("PLAY_MODE", "");
        if (test.contains(one) && test_two.contains(test_f)) {
            Intent first = new Intent(DictionaryAll.getContexDictionaryAll(), Time_NoTime.class);
            first.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            applicationContext.startActivity(first);
        }
        if (test.contains(one) && test_two.contains(text_s)) {
            Intent second = new Intent(DictionaryAll.getContexDictionaryAll(), ComandNormal.class);
            second.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            applicationContext.startActivity(second);
        }
        if (test.contains(one) && test_two.contains(text_sev)) {
            Intent third = new Intent(DictionaryAll.getContexDictionaryAll(), ComandComand_Normal.class);
            third.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            applicationContext.startActivity(third);
        }
        if (test.contains(two) && test_two.contains(test_f)) {
            Intent first = new Intent(DictionaryAll.getContexDictionaryAll(), Time_NoTime.class);
            first.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            applicationContext.startActivity(first);
        }
        if (test.contains(two) && test_two.contains(text_s)) {
            Intent second = new Intent(DictionaryAll.getContexDictionaryAll(), ComandNormal.class);
            second.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            applicationContext.startActivity(second);
        }
        if (test.contains(two) && test_two.contains(text_sev)) {
            Intent third = new Intent(DictionaryAll.getContexDictionaryAll(), ComandComand_Normal.class);
            third.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            applicationContext.startActivity(third);
        }
        if (test.contains(three) && test_two.contains(test_f)) {
            Intent first = new Intent(DictionaryAll.getContexDictionaryAll(), Time_NoTime.class);
            first.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            applicationContext.startActivity(first);
        }
        if (test.contains(three) && test_two.contains(text_s)) {
            Intent second = new Intent(DictionaryAll.getContexDictionaryAll(), ComandNormal.class);
            second.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            applicationContext.startActivity(second);
        }
        if (test.contains(three) && test_two.contains(text_sev)) {
            Intent third = new Intent(DictionaryAll.getContexDictionaryAll(), ComandComand_Normal.class);
            third.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            applicationContext.startActivity(third);
        }
        if (test.contains(four) && test_two.contains(test_f)) {
            Intent first = new Intent(DictionaryAll.getContexDictionaryAll(), Time_NoTime.class);
            first.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            applicationContext.startActivity(first);
        }
        if (test.contains(four) && test_two.contains(text_s)) {
            Intent second = new Intent(DictionaryAll.getContexDictionaryAll(), ComandNormal.class);
            second.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            applicationContext.startActivity(second);
        }
        if (test.contains(four) && test_two.contains(text_sev)) {
            Intent third = new Intent(DictionaryAll.getContexDictionaryAll(), ComandComand_Normal.class);
            third.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            applicationContext.startActivity(third);
        }

    }

    public static String GetMainMenuCoins() {
        Context applicationContext = MainMenu.getContextMainMenu();
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        return sharedPreferences.getString("COIN", "");
    }
}
