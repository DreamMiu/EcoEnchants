package com.willfp.ecoenchants.enchantments.ecoenchants.artifact;

import com.willfp.ecoenchants.enchantments.itemtypes.Artifact;
import org.bukkit.Particle;
import org.jetbrains.annotations.NotNull;

public class DragonArtifact extends Artifact {
    public DragonArtifact() {
        super(
                "dragon_artifact"
        );
    }

    @Override
    public @NotNull Particle getParticle() {
        return Particle.DRAGON_BREATH;
    }
}