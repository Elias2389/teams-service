package com.ae.teams.entity

import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.*

@Entity
@Table(name = "teams")
data class TeamEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long,
        @Column(name = "qr_code")
        @JsonProperty("qr_code")
        var qrCode: String?,
        var name: String,
        @Column(name = "url_img")
        @JsonProperty("url_img") var urlImg: String?
)