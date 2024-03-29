/*
 * (C) Copyright 2014 Roberto Estrada Casarrubios.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package me.robertoestrada.rssreader.fragments;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import me.robertoestrada.rssreader.R;

/**
 * This fragment is the one which controls the app settings
 */
public class SettingsFragment extends PreferenceFragment{
    @Override
    public void onCreate(final Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.app_prefs);
    }
}
