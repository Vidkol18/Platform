package com.vidkol.platform.data.item;

import com.vidkol.platform.Platform;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class PlatformItemModelsProvider extends ItemModelProvider {

    public PlatformItemModelsProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Platform.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

    }
}
