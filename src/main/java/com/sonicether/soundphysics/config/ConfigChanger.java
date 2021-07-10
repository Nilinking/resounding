package com.sonicether.soundphysics.config;

import org.jetbrains.annotations.Nullable;

public class ConfigChanger {
    public static void changeConfig(SoundPhysicsConfig config, @Nullable Boolean enabled,
        @Nullable Double attenuationFactor, @Nullable Double globalReverbGain, @Nullable Double globalReverbBrightness, @Nullable Double globalBlockAbsorption, @Nullable Double globalBlockReflectance, @Nullable Double soundDistanceAllowance, @Nullable Double airAbsorption, @Nullable Double underwaterFilter,
        @Nullable Boolean skipRainOcclusionTracing, @Nullable Integer environmentEvaluationRays, @Nullable Boolean simplerSharedAirspaceSimulation,
        @Nullable Double stoneReflectivity, @Nullable Double woodReflectivity, @Nullable Double groundReflectivity, @Nullable Double foliageReflectivity, @Nullable Double metalReflectivity, @Nullable Double glassReflectivity, @Nullable Double clothReflectivity, @Nullable Double sandReflectivity, @Nullable Double snowReflectivity,
        @Nullable Double leakyBlocksOcclusionMultiplier, @Nullable Double maxDirectOcclusionFromBlocks, @Nullable Boolean _9RayDirectOcclusion,
        @Nullable Boolean debugLogging, @Nullable Boolean occlusionLogging, @Nullable Boolean environmentLogging, @Nullable Boolean performanceLogging
    ) {
        if (enabled != null) config.enabled = enabled;
        config.reloadReverb = true;
        setGeneral(config.General, attenuationFactor, globalReverbGain, globalReverbBrightness, globalBlockAbsorption, globalBlockReflectance, soundDistanceAllowance, airAbsorption, underwaterFilter);
        setPerformance(config.Performance, skipRainOcclusionTracing, environmentEvaluationRays, simplerSharedAirspaceSimulation);
        setMaterial_Properties(config.Material_Properties, stoneReflectivity, woodReflectivity, groundReflectivity, foliageReflectivity, metalReflectivity, glassReflectivity, clothReflectivity, sandReflectivity, snowReflectivity);
        setVlads_Tweaks(config.Vlads_Tweaks, leakyBlocksOcclusionMultiplier, maxDirectOcclusionFromBlocks, _9RayDirectOcclusion);
        setMisc(config.Misc, debugLogging, occlusionLogging, environmentLogging, performanceLogging);
        config.preset = ConfigPresets.LOAD_SUCCESS;
        ConfigManager.save();
    }

    public static void setGeneral(SoundPhysicsConfig.General general, @Nullable Double attenuationFactor, @Nullable Double globalReverbGain, @Nullable Double globalReverbBrightness, @Nullable Double globalBlockAbsorption, @Nullable Double globalBlockReflectance, @Nullable Double soundDistanceAllowance, @Nullable Double airAbsorption, @Nullable Double underwaterFilter) {
        if (attenuationFactor != null) general.attenuationFactor = attenuationFactor;
        if (globalReverbGain != null) general.globalReverbGain = globalReverbGain;
        if (globalReverbBrightness != null) general.globalReverbBrightness = globalReverbBrightness;
        if (globalBlockAbsorption != null) general.globalBlockAbsorption = globalBlockAbsorption;
        if (globalBlockReflectance != null) general.globalBlockReflectance = globalBlockReflectance;
        if (soundDistanceAllowance != null) general.soundDistanceAllowance = soundDistanceAllowance;
        if (airAbsorption != null) general.airAbsorption = airAbsorption;
        if (underwaterFilter != null) general.underwaterFilter = underwaterFilter;
    }

    public static void setPerformance(SoundPhysicsConfig.Performance performance, @Nullable Boolean skipRainOcclusionTracing, @Nullable Integer environmentEvaluationRays, @Nullable Boolean simplerSharedAirspaceSimulation) {
        if (skipRainOcclusionTracing != null) performance.skipRainOcclusionTracing = skipRainOcclusionTracing;
        if (environmentEvaluationRays != null) performance.environmentEvaluationRays = environmentEvaluationRays;
        if (simplerSharedAirspaceSimulation != null) performance.simplerSharedAirspaceSimulation = simplerSharedAirspaceSimulation;
    }

    public static void setMaterial_Properties(SoundPhysicsConfig.Material_Properties material_properties, @Nullable Double stoneReflectivity, @Nullable Double woodReflectivity, @Nullable Double groundReflectivity, @Nullable Double foliageReflectivity, @Nullable Double metalReflectivity, @Nullable Double glassReflectivity, @Nullable Double clothReflectivity, @Nullable Double sandReflectivity, @Nullable Double snowReflectivity) {
        if (stoneReflectivity != null) material_properties.stoneReflectivity = stoneReflectivity;
        if (woodReflectivity != null) material_properties.woodReflectivity = woodReflectivity;
        if (groundReflectivity != null) material_properties.groundReflectivity = groundReflectivity;
        if (foliageReflectivity != null) material_properties.foliageReflectivity = foliageReflectivity;
        if (metalReflectivity != null) material_properties.metalReflectivity = metalReflectivity;
        if (glassReflectivity != null) material_properties.glassReflectivity = glassReflectivity;
        if (clothReflectivity != null) material_properties.clothReflectivity = clothReflectivity;
        if (sandReflectivity != null) material_properties.sandReflectivity = sandReflectivity;
        if (snowReflectivity != null) material_properties.snowReflectivity = snowReflectivity;
    }

    public static void setVlads_Tweaks(SoundPhysicsConfig.Vlads_Tweaks vlads_tweaks, @Nullable Double leakyBlocksOcclusionMultiplier, @Nullable Double maxDirectOcclusionFromBlocks, @Nullable Boolean _9RayDirectOcclusion) {
        if (leakyBlocksOcclusionMultiplier != null) vlads_tweaks.leakyBlocksOcclusionMultiplier = leakyBlocksOcclusionMultiplier;
        if (maxDirectOcclusionFromBlocks != null) vlads_tweaks.maxDirectOcclusionFromBlocks = maxDirectOcclusionFromBlocks;
        if (_9RayDirectOcclusion != null) vlads_tweaks._9RayDirectOcclusion = _9RayDirectOcclusion;
    }

    public static void setMisc(SoundPhysicsConfig.Misc misc, @Nullable Boolean debugLogging, @Nullable Boolean occlusionLogging, @Nullable Boolean environmentLogging, @Nullable Boolean performanceLogging) {
        if (debugLogging != null) misc.debugLogging = debugLogging;
        if (occlusionLogging != null) misc.occlusionLogging = occlusionLogging;
        if (environmentLogging != null) misc.environmentLogging = environmentLogging;
        if (performanceLogging != null) misc.performanceLogging = performanceLogging;
    }
}