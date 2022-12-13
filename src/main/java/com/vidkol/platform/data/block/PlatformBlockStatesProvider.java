package com.vidkol.platform.data.block;

import com.vidkol.platform.Platform;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class PlatformBlockStatesProvider extends BlockStateProvider {

    public PlatformBlockStatesProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Platform.MODID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

    }

}
