<template>

  <el-link href="https://element-plus.gitee.io/zh-CN/component/button.html" target="_blank">
    <el-icon :size="50"><Document /></el-icon>
  </el-link>

  <div class="demo-progress">
    <el-progress :percentage="50" :indeterminate="true"/>
    <el-progress :percentage="100" :format="format" :indeterminate="true"/>
    <el-progress
      :percentage="100"
      status="success"
      :indeterminate="true"
      :duration="5"
    />
    <el-progress
      :percentage="100"
      status="warning"
      :indeterminate="true"
      :duration="1"
    />
    <el-progress :percentage="50" status="exception" :indeterminate="true"/>
  </div>

    <el-menu
      :default-active="activeIndex"
      class="el-menu-demo"
      mode="horizontal"
      @select="handleSelect"
    >
      <el-menu-item index="1">Processing Center</el-menu-item>
      <el-sub-menu index="2">
        <template #title>Workspace</template>
        <el-menu-item index="2-1">item one</el-menu-item>
        <el-menu-item index="2-2">item two</el-menu-item>
        <el-menu-item index="2-3">item three</el-menu-item>
        <el-sub-menu index="2-4">
          <template #title>item four</template>
          <el-menu-item index="2-4-1">item one</el-menu-item>
          <el-menu-item index="2-4-2">item two</el-menu-item>
          <el-menu-item index="2-4-3">item three</el-menu-item>
        </el-sub-menu>
      </el-sub-menu>
      <el-menu-item index="3" disabled>Info</el-menu-item>
      <el-menu-item index="4">Orders</el-menu-item>
    </el-menu>
    <div class="h-6" />
    <el-menu
      :default-active="activeIndex2"
      class="el-menu-demo"
      mode="horizontal"
      background-color="#545c64"
      text-color="#fff"
      active-text-color="#ffd04b"
      @select="handleSelect"
    >
      <el-menu-item index="1">Processing Center</el-menu-item>
      <el-sub-menu index="2">
        <template #title>Workspace</template>
        <el-menu-item index="2-1">item one</el-menu-item>
        <el-menu-item index="2-2">item two</el-menu-item>
        <el-menu-item index="2-3">item three</el-menu-item>
        <el-sub-menu index="2-4">
          <template #title>item four</template>
          <el-menu-item index="2-4-1">item one</el-menu-item>
          <el-menu-item index="2-4-2">item two</el-menu-item>
          <el-menu-item index="2-4-3">item three</el-menu-item>
        </el-sub-menu>
      </el-sub-menu>
      <el-menu-item index="3" disabled>Info</el-menu-item>
      <el-menu-item index="4">Orders</el-menu-item>
    </el-menu>


  <el-backtop :bottom="100">
    <div style="
        height: 100%;
        width: 100%;
        background-color: #f2f5f6;
        box-shadow: 0 0 6px rgba(0, 0, 0, 0.12);
        text-align: center;
        line-height: 40px;
        color: #1989fa; ">
      UP
    </div>
  </el-backtop>


  <el-row>
    <el-col :sm="12" :lg="6">
      <el-result
        icon="success"
        title="Success Tip"
        sub-title="Please follow the instructions"
      >
        <template #extra>
          <el-button type="primary">Back</el-button>
        </template>
      </el-result>
    </el-col>
    <el-col :sm="12" :lg="6">
      <el-result
        icon="warning"
        title="Warning Tip"
        sub-title="Please follow the instructions"
      >
        <template #extra>
          <el-button type="primary">Back</el-button>
        </template>
      </el-result>
    </el-col>
    <el-col :sm="12" :lg="6">
      <el-result
        icon="error"
        title="Error Tip"
        sub-title="Please follow the instructions"
      >
        <template #extra>
          <el-button type="primary">Back</el-button>
        </template>
      </el-result>
    </el-col>
    <el-col :sm="12" :lg="6">
      <el-result icon="info" title="Info Tip">
        <template #sub-title>
          <p>Using slot as subtitle</p>
        </template>
        <template #extra>
          <el-button type="primary">Back</el-button>
        </template>
      </el-result>
    </el-col>
  </el-row>

  <el-calendar v-model="value"/>



</template>

<script lang="ts" setup>

import {ref} from 'vue'

const value = ref(new Date())

const format = (percentage) => (percentage === 100 ? 'Full' : `${percentage}%`)

const activeIndex = ref('1')
const activeIndex2 = ref('1')
const handleSelect = (key: string, keyPath: string[]) => {
  console.log(key, keyPath)

}

import { Document, View as IconView } from '@element-plus/icons-vue'


</script>
<style scoped>
.demo-progress .el-progress--line {
  margin-bottom: 15px;
  width: 350px;
}
.el-link {
  margin-right: 8px;
}
</style>
