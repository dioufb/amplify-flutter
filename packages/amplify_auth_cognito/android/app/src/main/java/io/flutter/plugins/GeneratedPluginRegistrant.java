package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;
import com.amazonaws.amplify.amplify_core.Core;
import com.amazonaws.amplify.amplify_auth_cognito.AuthCognito;

/**
 * Generated file. Do not edit.
 */
public final class GeneratedPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    Core.registerWith(registry.registrarFor("com.amazonaws.amplify.amplify_core.Core"));
    AuthCognito.registerWith(registry.registrarFor("com.amazonaws.amplify.amplify_auth_cognito.AuthCognito"));
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = GeneratedPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}
