<template>
  <div class="app-container home">
    <el-card class="box-card">
      <p>版本情况:</p>
      <p>campus-imaotai:{{ version }}</p>
      <p>campus框架:{{ frameworkVersion }}</p>
    </el-card>
  </div>
</template>

<script>
import {getVersion} from "@/api/system/index";

export default {
  name: "Index",
  data() {
    return {
      // 版本号
      version: "",
      frameworkVersion: "",
    };
  },
  created() {
    this.getVersion();
  },
  methods: {
    getVersion() {
      getVersion().then((response) => {
          this.version = response.data.version;
          this.frameworkVersion = response.data.frameworkVersion;
        }
      );
    }
  },
};
</script>

<style scoped lang="scss">
.home {
  blockquote {
    padding: 10px 20px;
    margin: 0 0 20px;
    font-size: 17.5px;
    border-left: 5px solid #eee;
  }

  hr {
    margin-top: 20px;
    margin-bottom: 20px;
    border: 0;
    border-top: 1px solid #eee;
  }

  .col-item {
    margin-bottom: 20px;
  }

  ul {
    padding: 0;
    margin: 0;
  }

  font-family: "open sans", "Helvetica Neue", Helvetica, Arial, sans-serif;
  font-size: 13px;
  color: #676a6c;
  overflow-x: hidden;

  ul {
    list-style-type: none;
  }

  h4 {
    margin-top: 0px;
  }

  h2 {
    margin-top: 10px;
    font-size: 26px;
    font-weight: 100;
  }

  p {
    margin-top: 10px;

    b {
      font-weight: 700;
    }
  }

  .update-log {
    ol {
      display: block;
      list-style-type: decimal;
      margin-block-start: 1em;
      margin-block-end: 1em;
      margin-inline-start: 0;
      margin-inline-end: 0;
      padding-inline-start: 40px;
    }
  }
}
</style>

