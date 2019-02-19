# stackview
Read a local file which contains Json objects.  Parse the file and print output based on the user input in the console.  Below is the example of the output:


Enter input or enter 0 to exit

StackView
You have entered StackView

{"class":"StackView","classNames":["column","container"],"subviews":[{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"VideoModeSelect","identifier":"videoMode"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"r_allow_high_dpi"}},{"class":"Input","control":{"class":"CvarSelect","identifier":"windowMode","var":"r_fullscreen"}},{"class":"Input","control":{"class":"CvarSelect","identifier":"verticalSync","var":"r_swap_interval"}},{"class":"Input","control":{"class":"CvarSlider","var":"cl_max_fps","min":"0","max":"250","step":"5"}}]}},{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"CvarSelect","identifier":"textureMode","var":"r_texture_mode","expectsStringValue":true}},{"class":"Input","control":{"class":"CvarSelect","identifier":"anisotropy","var":"r_anisotropy"}},{"class":"Input","control":{"class":"CvarSelect","identifier":"multisample","var":"r_multisample"}},{"class":"Input","control":{"class":"CvarSelect","identifier":"supersample","var":"r_supersample"}}]}}]}
{"class":"StackView","classNames":["column","container"],"subviews":[{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"CvarSlider","var":"r_brightness","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_contrast","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_gamma","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_modulate","min":"1","max":"5"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_bumpmap","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_hardness","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_specular","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_parallax","min":"0.1","max":"2"}}]}}]}
{"class":"StackView","classNames":["column","container"],"subviews":[{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"CvarSlider","var":"s_volume","min":"0","max":"1"}},{"class":"Input","control":{"class":"CvarSlider","var":"s_effects_volume","min":"0","max":"1"}},{"class":"Input","control":{"class":"CvarSlider","var":"s_ambient_volume","min":"0","max":"1"}},{"class":"Input","control":{"class":"CvarSlider","var":"s_music_volume","min":"0","max":"1"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"s_reverse"}}]}},{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"CvarSelect","identifier":"rate","var":"rate"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"cl_download_maps"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"cl_download_models"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"cl_draw_net_graph"}}]}}]}
{"class":"StackView","classNames":["columns","container"],"subviews":[{"class":"StackView","classNames":["column","container"],"subviews":[{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"VideoModeSelect","identifier":"videoMode"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"r_allow_high_dpi"}},{"class":"Input","control":{"class":"CvarSelect","identifier":"windowMode","var":"r_fullscreen"}},{"class":"Input","control":{"class":"CvarSelect","identifier":"verticalSync","var":"r_swap_interval"}},{"class":"Input","control":{"class":"CvarSlider","var":"cl_max_fps","min":"0","max":"250","step":"5"}}]}},{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"CvarSelect","identifier":"textureMode","var":"r_texture_mode","expectsStringValue":true}},{"class":"Input","control":{"class":"CvarSelect","identifier":"anisotropy","var":"r_anisotropy"}},{"class":"Input","control":{"class":"CvarSelect","identifier":"multisample","var":"r_multisample"}},{"class":"Input","control":{"class":"CvarSelect","identifier":"supersample","var":"r_supersample"}}]}}]},{"class":"StackView","classNames":["column","container"],"subviews":[{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"CvarSlider","var":"r_brightness","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_contrast","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_gamma","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_modulate","min":"1","max":"5"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_bumpmap","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_hardness","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_specular","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_parallax","min":"0.1","max":"2"}}]}}]},{"class":"StackView","classNames":["column","container"],"subviews":[{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"CvarSlider","var":"s_volume","min":"0","max":"1"}},{"class":"Input","control":{"class":"CvarSlider","var":"s_effects_volume","min":"0","max":"1"}},{"class":"Input","control":{"class":"CvarSlider","var":"s_ambient_volume","min":"0","max":"1"}},{"class":"Input","control":{"class":"CvarSlider","var":"s_music_volume","min":"0","max":"1"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"s_reverse"}}]}},{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"CvarSelect","identifier":"rate","var":"rate"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"cl_download_maps"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"cl_download_models"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"cl_draw_net_graph"}}]}}]}]}
{"class":"StackView","classNames":["accessoryView","container"],"subviews":[{"class":"Button","identifier":"apply"}]}
{"class":"StackView","classNames":["container"],"subviews":[{"class":"StackView","classNames":["columns","container"],"subviews":[{"class":"StackView","classNames":["column","container"],"subviews":[{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"VideoModeSelect","identifier":"videoMode"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"r_allow_high_dpi"}},{"class":"Input","control":{"class":"CvarSelect","identifier":"windowMode","var":"r_fullscreen"}},{"class":"Input","control":{"class":"CvarSelect","identifier":"verticalSync","var":"r_swap_interval"}},{"class":"Input","control":{"class":"CvarSlider","var":"cl_max_fps","min":"0","max":"250","step":"5"}}]}},{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"CvarSelect","identifier":"textureMode","var":"r_texture_mode","expectsStringValue":true}},{"class":"Input","control":{"class":"CvarSelect","identifier":"anisotropy","var":"r_anisotropy"}},{"class":"Input","control":{"class":"CvarSelect","identifier":"multisample","var":"r_multisample"}},{"class":"Input","control":{"class":"CvarSelect","identifier":"supersample","var":"r_supersample"}}]}}]},{"class":"StackView","classNames":["column","container"],"subviews":[{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"CvarSlider","var":"r_brightness","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_contrast","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_gamma","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_modulate","min":"1","max":"5"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_bumpmap","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_hardness","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_specular","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_parallax","min":"0.1","max":"2"}}]}}]},{"class":"StackView","classNames":["column","container"],"subviews":[{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"CvarSlider","var":"s_volume","min":"0","max":"1"}},{"class":"Input","control":{"class":"CvarSlider","var":"s_effects_volume","min":"0","max":"1"}},{"class":"Input","control":{"class":"CvarSlider","var":"s_ambient_volume","min":"0","max":"1"}},{"class":"Input","control":{"class":"CvarSlider","var":"s_music_volume","min":"0","max":"1"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"s_reverse"}}]}},{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"CvarSelect","identifier":"rate","var":"rate"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"cl_download_maps"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"cl_download_models"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"cl_draw_net_graph"}}]}}]}]},{"class":"StackView","classNames":["accessoryView","container"],"subviews":[{"class":"Button","identifier":"apply"}]}]}

Box
You have entered Box

{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"VideoModeSelect","identifier":"videoMode"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"r_allow_high_dpi"}},{"class":"Input","control":{"class":"CvarSelect","identifier":"windowMode","var":"r_fullscreen"}},{"class":"Input","control":{"class":"CvarSelect","identifier":"verticalSync","var":"r_swap_interval"}},{"class":"Input","control":{"class":"CvarSlider","var":"cl_max_fps","min":"0","max":"250","step":"5"}}]}}
{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"CvarSelect","identifier":"textureMode","var":"r_texture_mode","expectsStringValue":true}},{"class":"Input","control":{"class":"CvarSelect","identifier":"anisotropy","var":"r_anisotropy"}},{"class":"Input","control":{"class":"CvarSelect","identifier":"multisample","var":"r_multisample"}},{"class":"Input","control":{"class":"CvarSelect","identifier":"supersample","var":"r_supersample"}}]}}
{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"CvarSlider","var":"r_brightness","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_contrast","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_gamma","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_modulate","min":"1","max":"5"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_bumpmap","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_hardness","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_specular","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_parallax","min":"0.1","max":"2"}}]}}
{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"CvarSlider","var":"s_volume","min":"0","max":"1"}},{"class":"Input","control":{"class":"CvarSlider","var":"s_effects_volume","min":"0","max":"1"}},{"class":"Input","control":{"class":"CvarSlider","var":"s_ambient_volume","min":"0","max":"1"}},{"class":"Input","control":{"class":"CvarSlider","var":"s_music_volume","min":"0","max":"1"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"s_reverse"}}]}}
{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"CvarSelect","identifier":"rate","var":"rate"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"cl_download_maps"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"cl_download_models"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"cl_draw_net_graph"}}]}}

Input

You have entered Input

{"class":"Input","control":{"class":"VideoModeSelect","identifier":"videoMode"}}
{"class":"Input","control":{"class":"CvarCheckbox","var":"r_allow_high_dpi"}}
{"class":"Input","control":{"class":"CvarSelect","identifier":"windowMode","var":"r_fullscreen"}}
{"class":"Input","control":{"class":"CvarSelect","identifier":"verticalSync","var":"r_swap_interval"}}
{"class":"Input","control":{"class":"CvarSlider","var":"cl_max_fps","min":"0","max":"250","step":"5"}}
{"class":"Input","control":{"class":"CvarSelect","identifier":"textureMode","var":"r_texture_mode","expectsStringValue":true}}
{"class":"Input","control":{"class":"CvarSelect","identifier":"anisotropy","var":"r_anisotropy"}}
{"class":"Input","control":{"class":"CvarSelect","identifier":"multisample","var":"r_multisample"}}
{"class":"Input","control":{"class":"CvarSelect","identifier":"supersample","var":"r_supersample"}}
{"class":"Input","control":{"class":"CvarSlider","var":"r_brightness","min":"0.1","max":"2"}}
{"class":"Input","control":{"class":"CvarSlider","var":"r_contrast","min":"0.1","max":"2"}}
{"class":"Input","control":{"class":"CvarSlider","var":"r_gamma","min":"0.1","max":"2"}}
{"class":"Input","control":{"class":"CvarSlider","var":"r_modulate","min":"1","max":"5"}}
{"class":"Input","control":{"class":"CvarSlider","var":"r_bumpmap","min":"0.1","max":"2"}}
{"class":"Input","control":{"class":"CvarSlider","var":"r_hardness","min":"0.1","max":"2"}}
{"class":"Input","control":{"class":"CvarSlider","var":"r_specular","min":"0.1","max":"2"}}
{"class":"Input","control":{"class":"CvarSlider","var":"r_parallax","min":"0.1","max":"2"}}
{"class":"Input","control":{"class":"CvarSlider","var":"s_volume","min":"0","max":"1"}}
{"class":"Input","control":{"class":"CvarSlider","var":"s_effects_volume","min":"0","max":"1"}}
{"class":"Input","control":{"class":"CvarSlider","var":"s_ambient_volume","min":"0","max":"1"}}
{"class":"Input","control":{"class":"CvarSlider","var":"s_music_volume","min":"0","max":"1"}}
{"class":"Input","control":{"class":"CvarCheckbox","var":"s_reverse"}}
{"class":"Input","control":{"class":"CvarSelect","identifier":"rate","var":"rate"}}
{"class":"Input","control":{"class":"CvarCheckbox","var":"cl_download_maps"}}
{"class":"Input","control":{"class":"CvarCheckbox","var":"cl_download_models"}}
{"class":"Input","control":{"class":"CvarCheckbox","var":"cl_draw_net_graph"}}

.column

You have entered .column

{"class":"StackView","classNames":["column","container"],"subviews":[{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"VideoModeSelect","identifier":"videoMode"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"r_allow_high_dpi"}},{"class":"Input","control":{"class":"CvarSelect","identifier":"windowMode","var":"r_fullscreen"}},{"class":"Input","control":{"class":"CvarSelect","identifier":"verticalSync","var":"r_swap_interval"}},{"class":"Input","control":{"class":"CvarSlider","var":"cl_max_fps","min":"0","max":"250","step":"5"}}]}},{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"CvarSelect","identifier":"textureMode","var":"r_texture_mode","expectsStringValue":true}},{"class":"Input","control":{"class":"CvarSelect","identifier":"anisotropy","var":"r_anisotropy"}},{"class":"Input","control":{"class":"CvarSelect","identifier":"multisample","var":"r_multisample"}},{"class":"Input","control":{"class":"CvarSelect","identifier":"supersample","var":"r_supersample"}}]}}]}
{"class":"StackView","classNames":["column","container"],"subviews":[{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"CvarSlider","var":"r_brightness","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_contrast","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_gamma","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_modulate","min":"1","max":"5"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_bumpmap","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_hardness","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_specular","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_parallax","min":"0.1","max":"2"}}]}}]}
{"class":"StackView","classNames":["column","container"],"subviews":[{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"CvarSlider","var":"s_volume","min":"0","max":"1"}},{"class":"Input","control":{"class":"CvarSlider","var":"s_effects_volume","min":"0","max":"1"}},{"class":"Input","control":{"class":"CvarSlider","var":"s_ambient_volume","min":"0","max":"1"}},{"class":"Input","control":{"class":"CvarSlider","var":"s_music_volume","min":"0","max":"1"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"s_reverse"}}]}},{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"CvarSelect","identifier":"rate","var":"rate"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"cl_download_maps"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"cl_download_models"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"cl_draw_net_graph"}}]}}]}

.container

You have entered .container

{"class":"StackView","classNames":["column","container"],"subviews":[{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"VideoModeSelect","identifier":"videoMode"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"r_allow_high_dpi"}},{"class":"Input","control":{"class":"CvarSelect","identifier":"windowMode","var":"r_fullscreen"}},{"class":"Input","control":{"class":"CvarSelect","identifier":"verticalSync","var":"r_swap_interval"}},{"class":"Input","control":{"class":"CvarSlider","var":"cl_max_fps","min":"0","max":"250","step":"5"}}]}},{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"CvarSelect","identifier":"textureMode","var":"r_texture_mode","expectsStringValue":true}},{"class":"Input","control":{"class":"CvarSelect","identifier":"anisotropy","var":"r_anisotropy"}},{"class":"Input","control":{"class":"CvarSelect","identifier":"multisample","var":"r_multisample"}},{"class":"Input","control":{"class":"CvarSelect","identifier":"supersample","var":"r_supersample"}}]}}]}
{"class":"StackView","classNames":["column","container"],"subviews":[{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"CvarSlider","var":"r_brightness","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_contrast","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_gamma","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_modulate","min":"1","max":"5"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_bumpmap","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_hardness","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_specular","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_parallax","min":"0.1","max":"2"}}]}}]}
{"class":"StackView","classNames":["column","container"],"subviews":[{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"CvarSlider","var":"s_volume","min":"0","max":"1"}},{"class":"Input","control":{"class":"CvarSlider","var":"s_effects_volume","min":"0","max":"1"}},{"class":"Input","control":{"class":"CvarSlider","var":"s_ambient_volume","min":"0","max":"1"}},{"class":"Input","control":{"class":"CvarSlider","var":"s_music_volume","min":"0","max":"1"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"s_reverse"}}]}},{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"CvarSelect","identifier":"rate","var":"rate"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"cl_download_maps"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"cl_download_models"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"cl_draw_net_graph"}}]}}]}
{"class":"StackView","classNames":["columns","container"],"subviews":[{"class":"StackView","classNames":["column","container"],"subviews":[{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"VideoModeSelect","identifier":"videoMode"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"r_allow_high_dpi"}},{"class":"Input","control":{"class":"CvarSelect","identifier":"windowMode","var":"r_fullscreen"}},{"class":"Input","control":{"class":"CvarSelect","identifier":"verticalSync","var":"r_swap_interval"}},{"class":"Input","control":{"class":"CvarSlider","var":"cl_max_fps","min":"0","max":"250","step":"5"}}]}},{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"CvarSelect","identifier":"textureMode","var":"r_texture_mode","expectsStringValue":true}},{"class":"Input","control":{"class":"CvarSelect","identifier":"anisotropy","var":"r_anisotropy"}},{"class":"Input","control":{"class":"CvarSelect","identifier":"multisample","var":"r_multisample"}},{"class":"Input","control":{"class":"CvarSelect","identifier":"supersample","var":"r_supersample"}}]}}]},{"class":"StackView","classNames":["column","container"],"subviews":[{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"CvarSlider","var":"r_brightness","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_contrast","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_gamma","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_modulate","min":"1","max":"5"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_bumpmap","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_hardness","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_specular","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_parallax","min":"0.1","max":"2"}}]}}]},{"class":"StackView","classNames":["column","container"],"subviews":[{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"CvarSlider","var":"s_volume","min":"0","max":"1"}},{"class":"Input","control":{"class":"CvarSlider","var":"s_effects_volume","min":"0","max":"1"}},{"class":"Input","control":{"class":"CvarSlider","var":"s_ambient_volume","min":"0","max":"1"}},{"class":"Input","control":{"class":"CvarSlider","var":"s_music_volume","min":"0","max":"1"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"s_reverse"}}]}},{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"CvarSelect","identifier":"rate","var":"rate"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"cl_download_maps"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"cl_download_models"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"cl_draw_net_graph"}}]}}]}]}
{"class":"StackView","classNames":["accessoryView","container"],"subviews":[{"class":"Button","identifier":"apply"}]}
{"class":"StackView","classNames":["container"],"subviews":[{"class":"StackView","classNames":["columns","container"],"subviews":[{"class":"StackView","classNames":["column","container"],"subviews":[{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"VideoModeSelect","identifier":"videoMode"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"r_allow_high_dpi"}},{"class":"Input","control":{"class":"CvarSelect","identifier":"windowMode","var":"r_fullscreen"}},{"class":"Input","control":{"class":"CvarSelect","identifier":"verticalSync","var":"r_swap_interval"}},{"class":"Input","control":{"class":"CvarSlider","var":"cl_max_fps","min":"0","max":"250","step":"5"}}]}},{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"CvarSelect","identifier":"textureMode","var":"r_texture_mode","expectsStringValue":true}},{"class":"Input","control":{"class":"CvarSelect","identifier":"anisotropy","var":"r_anisotropy"}},{"class":"Input","control":{"class":"CvarSelect","identifier":"multisample","var":"r_multisample"}},{"class":"Input","control":{"class":"CvarSelect","identifier":"supersample","var":"r_supersample"}}]}}]},{"class":"StackView","classNames":["column","container"],"subviews":[{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"CvarSlider","var":"r_brightness","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_contrast","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_gamma","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_modulate","min":"1","max":"5"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_bumpmap","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_hardness","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_specular","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_parallax","min":"0.1","max":"2"}}]}}]},{"class":"StackView","classNames":["column","container"],"subviews":[{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"CvarSlider","var":"s_volume","min":"0","max":"1"}},{"class":"Input","control":{"class":"CvarSlider","var":"s_effects_volume","min":"0","max":"1"}},{"class":"Input","control":{"class":"CvarSlider","var":"s_ambient_volume","min":"0","max":"1"}},{"class":"Input","control":{"class":"CvarSlider","var":"s_music_volume","min":"0","max":"1"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"s_reverse"}}]}},{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"CvarSelect","identifier":"rate","var":"rate"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"cl_download_maps"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"cl_download_models"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"cl_draw_net_graph"}}]}}]}]},{"class":"StackView","classNames":["accessoryView","container"],"subviews":[{"class":"Button","identifier":"apply"}]}]}

.accessoryView

You have entered .accessoryView

{"class":"StackView","classNames":["accessoryView","container"],"subviews":[{"class":"Button","identifier":"apply"}]}

#videoMode

You have entered #videoMode

{"class":"Input","control":{"class":"VideoModeSelect","identifier":"videoMode"}}

#windowMode

You have entered #windowMode

{"class":"Input","control":{"class":"CvarSelect","identifier":"windowMode","var":"r_fullscreen"}}

#verticalSync

You have entered #verticalSync

{"class":"Input","control":{"class":"CvarSelect","identifier":"verticalSync","var":"r_swap_interval"}}

#textureMode

You have entered #textureMode

{"class":"Input","control":{"class":"CvarSelect","identifier":"textureMode","var":"r_texture_mode","expectsStringValue":true}}

#anisotropy

You have entered #anisotropy

{"class":"Input","control":{"class":"CvarSelect","identifier":"anisotropy","var":"r_anisotropy"}}

#multisample

You have entered #multisample

{"class":"Input","control":{"class":"CvarSelect","identifier":"multisample","var":"r_multisample"}}

#supersample

You have entered #supersample

{"class":"Input","control":{"class":"CvarSelect","identifier":"supersample","var":"r_supersample"}}

#rate

You have entered #rate

{"class":"Input","control":{"class":"CvarSelect","identifier":"rate","var":"rate"}}

#apply

You have entered #apply

{"class":"Button","identifier":"apply"}

stackview

You have entered stackview

box

You have entered box

Box

You have entered Box

{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"VideoModeSelect","identifier":"videoMode"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"r_allow_high_dpi"}},{"class":"Input","control":{"class":"CvarSelect","identifier":"windowMode","var":"r_fullscreen"}},{"class":"Input","control":{"class":"CvarSelect","identifier":"verticalSync","var":"r_swap_interval"}},{"class":"Input","control":{"class":"CvarSlider","var":"cl_max_fps","min":"0","max":"250","step":"5"}}]}}
{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"CvarSelect","identifier":"textureMode","var":"r_texture_mode","expectsStringValue":true}},{"class":"Input","control":{"class":"CvarSelect","identifier":"anisotropy","var":"r_anisotropy"}},{"class":"Input","control":{"class":"CvarSelect","identifier":"multisample","var":"r_multisample"}},{"class":"Input","control":{"class":"CvarSelect","identifier":"supersample","var":"r_supersample"}}]}}
{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"CvarSlider","var":"r_brightness","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_contrast","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_gamma","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_modulate","min":"1","max":"5"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_bumpmap","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_hardness","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_specular","min":"0.1","max":"2"}},{"class":"Input","control":{"class":"CvarSlider","var":"r_parallax","min":"0.1","max":"2"}}]}}
{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"CvarSlider","var":"s_volume","min":"0","max":"1"}},{"class":"Input","control":{"class":"CvarSlider","var":"s_effects_volume","min":"0","max":"1"}},{"class":"Input","control":{"class":"CvarSlider","var":"s_ambient_volume","min":"0","max":"1"}},{"class":"Input","control":{"class":"CvarSlider","var":"s_music_volume","min":"0","max":"1"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"s_reverse"}}]}}
{"class":"Box","contentView":{"subviews":[{"class":"Input","control":{"class":"CvarSelect","identifier":"rate","var":"rate"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"cl_download_maps"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"cl_download_models"}},{"class":"Input","control":{"class":"CvarCheckbox","var":"cl_draw_net_graph"}}]}}

.test

You have entered .test

#identify

You have entered #identify
