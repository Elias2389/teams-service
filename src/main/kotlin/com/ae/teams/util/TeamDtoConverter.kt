package com.ae.teams.util

import com.ae.teams.dto.TeamResponse
import com.ae.teams.entity.TeamEntity

fun TeamEntity.toTeamResponse() = TeamResponse(
    name = name
)

fun List<TeamEntity>.toTeamResponse(teamEntities: List<TeamEntity>): List<TeamResponse> {
    return teamEntities.map { it.toTeamResponse() }
}


