package com.vidkol.platform.data;

import com.vidkol.platform.Platform;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraftforge.common.data.LanguageProvider;

public class PlatformLanguageProvider extends LanguageProvider {

    public PlatformLanguageProvider(DataGenerator generator, String locale) {
        super(generator, Platform.MODID, locale);
    }

    @Override
    protected void addTranslations() {

    }
}
