package com.willfp.ecobosses.bosses.util.obj;

import lombok.Data;

import java.util.UUID;

public record DamagerProperty(UUID playerUUID, double damage) {

}
