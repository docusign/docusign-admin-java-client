package com.docusign.admin.client.auth;

import com.docusign.admin.client.auth.OAuth.OAuthToken;

public interface AccessTokenListener {
  void notify(OAuthToken token);
}