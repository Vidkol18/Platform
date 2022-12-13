package com.vidkol.platform.data.tags;

import com.vidkol.platform.Platform;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.TagManager;
import net.minecraft.world.level.levelgen.structure.StructureSet;
import net.minecraftforge.common.data.ExistingFileHelper;

public class PlatformStructureSetTagsProvider extends TagsProvider<StructureSet> {

    public PlatformStructureSetTagsProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, BuiltinRegistries.STRUCTURE_SETS, Platform.MODID, existingFileHelper);
    }

    @Override
    protected void addTags() {

    }

    @Override
    public String getName() {
        return "Platform Tags";
    }
}
