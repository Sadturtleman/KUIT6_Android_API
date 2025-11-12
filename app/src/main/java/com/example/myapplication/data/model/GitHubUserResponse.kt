package com.example.myapplication.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GitHubUserResponse(
    @SerialName("avatar_url")
    var avatarUrl: String,
    @SerialName("bio")
    var bio: String?,
    @SerialName("blog")
    var blog: String?,
    @SerialName("company")
    var company: String?,
    @SerialName("created_at")
    var createdAt: String?,
    @SerialName("email")
    var email: String?,
    @SerialName("events_url")
    var eventsUrl: String?,
    @SerialName("followers")
    var followers: Int?,
    @SerialName("followers_url")
    var followersUrl: String?,
    @SerialName("following")
    var following: Int?,
    @SerialName("following_url")
    var followingUrl: String?,
    @SerialName("gists_url")
    var gistsUrl: String?,
    @SerialName("gravatar_id")
    var gravatarId: String?,
    @SerialName("hireable")
    var hireable: String?,
    @SerialName("html_url")
    var htmlUrl: String?,
    @SerialName("id")
    var id: Int?,
    @SerialName("location")
    var location: String?,
    @SerialName("login")
    var login: String,
    @SerialName("name")
    var name: String,
    @SerialName("node_id")
    var nodeId: String?,
    @SerialName("organizations_url")
    var organizationsUrl: String?,
    @SerialName("public_gists")
    var publicGists: Int?,
    @SerialName("public_repos")
    var publicRepos: Int?,
    @SerialName("received_events_url")
    var receivedEventsUrl: String?,
    @SerialName("repos_url")
    var reposUrl: String?,
    @SerialName("site_admin")
    var siteAdmin: Boolean?,
    @SerialName("starred_url")
    var starredUrl: String?,
    @SerialName("subscriptions_url")
    var subscriptionsUrl: String?,
    @SerialName("twitter_username")
    var twitterUsername: String?,
    @SerialName("type")
    var type: String?,
    @SerialName("updated_at")
    var updatedAt: String?,
    @SerialName("url")
    var url: String?,
    @SerialName("user_view_type")
    var userViewType: String?
)